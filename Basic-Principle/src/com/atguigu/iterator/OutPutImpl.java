package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author shengxiao
 * @date 2021/9/28 16:28
 */
public class OutPutImpl {

    // 学院集合
    List<College> collegeList ;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院，然后调用printDepartment 输出 各个学院的系
    public void printCollege(){

        // 从collegeList 取出 所有学院，java中的List 已经实现了 Iterator
        Iterator<College> iterator = collegeList.iterator() ;   // 集合默认实现Iterator接口，故存在iterator()方法

        while(iterator.hasNext()){  // 此list集合是jdk自带的迭代器，为了遍历 每一个学院
            // 取出一个学院
            College college = iterator.next() ;
            System.out.println("=== " + college.getName() + "===");
            // 通过college.createIterator() 方法得到对应的 college学院下所属 部门信息的 迭代器，
            //此时将其作为printDepartment()方法的参数，从而进行遍历学院下所属部门的信息。
            printDepartment(college.createIterator());  // 得到对应的迭代器
        }
    }

    // 输出 学院输出系
    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department d = (Department) iterator.next();    // next(0方法是返回Object
            System.out.println(d.getName());
        }
    }
}
