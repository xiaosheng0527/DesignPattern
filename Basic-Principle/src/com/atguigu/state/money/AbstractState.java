package com.atguigu.state.money;

public abstract class AbstractState implements State {

    // 单例模式，创建出一个异常类，运行时若有异常，就报 运行时异常
	protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

	//抽象类，默认实现了 State 接口的所有方法
	//该类的所有方法，其子类(具体的状态类)，可以有选择的进行重写

    // 注意：默认实现 State接口的方法，为什么使用异常，你可以参照 设计模式书本 P40
    // 如果未在子类实现该方法，程序在运行时出错（报错，告知开发人员没有实现如下对应的方法）
    // 这样我们才可以第一时间 直到 到底 是什么 情况导致的错误
    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
