package com.atguigu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author shengxiao
 * @date 2021/9/28 16:10
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList ;   // 信息工程学院是以List 方式来存放 系
    int index = -1 ;    // 索引，这里初始化为-1 是为了和下面的index += 1，要对应，防止下标越界

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    // 判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {

        if(index >= departmentList.size() - 1){
            return false ;
        } else {
            index += 1 ;
            return true ;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index) ;
    }

    // 空实现remove
    @Override
    public void remove() {

    }
}
