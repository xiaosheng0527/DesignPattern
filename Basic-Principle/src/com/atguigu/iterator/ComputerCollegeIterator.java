package com.atguigu.iterator;

import com.sun.jmx.snmp.defaults.DefaultPaths;

import java.util.Iterator;

/**
 * @author shengxiao
 * @date 2021/9/28 16:00
 */
public class ComputerCollegeIterator implements Iterator {

    // 这里我们需要Department 是以怎样的方式存放 => 数组
    Department[] departments ;
    int position = 0 ; // 遍历的位置，此处需要从第0个位置开始遍历

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    // 判断是否还有下一个元素
    @Override
    public boolean hasNext() {

        // departments[position] == null ：说明当前遍历到的部门为null，则此时说明之后的所有部门都没有添加，
        // 故可以直接返回
        if(position >= departments.length || departments[position] == null){
            return false ;
        } else {
            return true;
        }

    }

    // 获取下一个元素
    @Override
    public Object next() {

        Department department = departments[position];
        position += 1 ;
        return department ;
    }

    // 删除的方法，默认空实现
    @Override
    public void remove() {

    }
}
