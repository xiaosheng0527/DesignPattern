package com.atguigu.proxy.dynamic_proxy2;

/**
 * @author shengxiao
 * @date 2021/10/4 16:09
 */
public interface UserManager {

    // 增
    void addUser(String userId,String userName) ;

    // 删
    void delUser(String userId) ;

    // 查
    String findUser(String userId) ;

    // 改
    void modifyUser(String userId,String userName) ;
}
