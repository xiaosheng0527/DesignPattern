package com.atguigu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shengxiao
 * @date 2021/9/13 19:59
 */
class Solution {

    // 定义两个哈希表，
    Map<Character,Integer> orign=new HashMap<>();   // 记录待匹配的字符串t在哈希表中的字符对应的出现的次数
    Map<Character,Integer>window=new HashMap<>(); //记录滑动窗口中的字符及出现的次数

    // 这两个指针主要是用于确定包含 字符串t的最小子串的区间，这里初始化为-1 说明其还未处理
    // 这里可以初始化为0，但是需要另外分析，故我们最好在没使用之前都初始化一个毫无关联的初始值
    // 注意：这里是 左闭右闭 [ansL,ansR]

    // ------------------------------------------------------------
    // 上面错误的理解思路可以放在这里，作为以后的分析的一种方向

    // 吐了，我疑神疑鬼，以为都是作为什么开闭 区间，殊不知这是下面对 l，r左右指针指向的满足包含 字符串t 的 覆盖
    // 而这里定义 初始化为 -1  主要是不想和 什么索引值 冲突，因为索引值都是 从0开始的
    int ansL=-1;//全局的左指针
    int ansR=-1;//全局的右指针
    int minSubLength=Integer.MAX_VALUE;
    int subLength = 0 ; //记录每次匹配符合时子串的长度

    public String minWindow(String s, String t) {

        // 此for循环主要是想把 待匹配的字符串t 通过哈希表 建立 字符 和 字符出现的次数 的 映射
        // 其实对于用不用特地把 字符串转换为 字符数组 来操作，没什么差别，多创建一个字符数组也不会造成空间复杂度的大幅度变化
        for (int i = 0; i < t.length() ; i++) {
            char c=t.charAt(i);
            // getOrDefault()方法：返回指定键映射到的值，如果此映射不包含键的映射，则返回defaultValue【这里用0代替】，这和python中的get()方法很像
            orign.put(c,orign.getOrDefault(c,0) +1 );
        }
        // 左、右指针
        // 目的：主要是通过这个指针 来遍历 字符串s，
        // 这里的初始化的含义：
        // l 初始化为0 主要是为了 后面 压缩 滑动窗口 时候，可以直接从第1个元素就开始收缩
        int l = 0 ;
        // r 初始化为 -1 是为了保证 [l,r] 左闭右闭 区间 在刚开始不会有区间存在，即从头开始
        // 之后如果要判断第一个元素，则需要先 r++，你要和 另外一种 做法 [left,right) 区别开来
        // 区间 开闭都是人为来控制的，只要你代码逻辑 条件清晰，能解决问题，那都是个好办法。
        int r = -1 ;
        while (r < s.length()){ // 退出条件，右边界 出界
            r++ ;   // 此时先移动 右边界

            //可能window中一个字符出现的次数要多于我们要比对的那个字符串中字符的个数
            // 这里是先添加对应的字符到 滑动窗口所在的哈希表中
            if(r < s.length() && orign.containsKey(s.charAt(r))) {
                window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
            }
            // l <= r : 为了保证下标不会 反着来，控制指针的合法性
            while (check() && l <= r){ //这里检查左指针是否可以收缩窗口，注意左指针可以收缩窗口的条件在于：窗口中包含了字符t
                //能够走到这里就说明已经符合要求了,但是要找到全局最小的子串，所以每次都要判断一下

                subLength = r - l + 1 ;
                if(subLength < minSubLength){
                    ansL = l ;
                    ansR = r ;
                    minSubLength = r - l + 1 ;
                }
                //如果window中的左边出现了t中的字符，直接减1，然后看是否还能满足完全覆盖的要求
                if(orign.containsKey(s.charAt(l))){
                    window.put(s.charAt(l),window.getOrDefault(s.charAt(l),0) - 1);
                }
                l++;    // 左指针右移
            }
        }
        // 注意：这里因为 [ansL,ansR] 是左闭右闭，故在substring()方法中，需要用 substring(ansL,ansR+1)
        return ansR == -1 ? "" :s.substring(ansL,ansR+1); //ansR==-1 说明没有符合的，就返回空字符串
    }

    //用于检测是否窗口中是否完全覆盖了子串
    public boolean check(){

        // map集合的遍历，可以使用内部类，Map.Entry，取出key中的集合，然后进行遍历判断
        for (Map.Entry e : orign.entrySet()){
            int value = (int) e.getValue();
            if(window.getOrDefault(e.getKey(), 0) < value){
                return false;
            } else {
                // 执行到else语句 说明，window.getOrDefault(e.getKey(), 0) >= value
                // 那么说明当前这个字符 是 符合题意的，此时需要判断下一个字符
                continue ;
            }

        }
        // 如果子串 的每个字符都符合 大于等于 字符串t ，那么就可以找到一个可行解
        return true;
    }

}
