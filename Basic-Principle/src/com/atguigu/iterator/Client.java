package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengxiao
 * @date 2021/9/28 16:36
 */
public class Client {

    public static void main(String[] args) {
        // 创建学院
        List<College> collegeList = new ArrayList<>();

        College computerCollege = new ComputerCollege() ;
        College infoCollege = new InfoCollege() ;
        collegeList.add(computerCollege) ;
        collegeList.add(infoCollege) ;

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }
}
