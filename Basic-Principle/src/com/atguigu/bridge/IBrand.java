package com.atguigu.bridge;

/**
 * @author shengxiao
 * @date 2021/9/10 16:59
 */

// Implementor【实现者】，该角色位于 "类的实现层次结构"的最上层
public interface IBrand {
    void open() ;
    void close() ;
    void call() ;
}
