package com.atguigu.jdk;

import java.util.HashMap;
import java.util.Map;

public class Composite {

	public static void main(String[] args) {
		
		
		//说明
		//1. Map 就是一个抽象的构建 (类似我们的Component)
		//2. HashMap是一个中间的构建(Composite), 实现/继承了相关方法
		//   put, putall 
		//3. Node 是 HashMap的静态内部类，类似Leaf叶子节点, 这里就没有put, putall
		//   static class Node<K,V> implements Map.Entry<K,V>
		
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(0, "东游记");//直接存放叶子节点(Node)
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "西游记");
		map.put(2, "红楼梦"); //..
		// putAll()方法：
		// 将所有映射从指定映射复制到此映射（可选操作）。
		// 此调用的效果等同于对指定映射中从键k到值v 的每个映射在此映射上调用一次put(k, v) 。
		// 如果在操作进行时修改了指定的映射，则此操作的行为未定义
		hashMap.putAll(map);
		System.out.println(hashMap);


	}

}
