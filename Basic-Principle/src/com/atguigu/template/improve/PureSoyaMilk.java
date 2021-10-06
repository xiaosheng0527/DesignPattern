package com.atguigu.template.improve;

/**
 * @author shengxiao
 * @date 2021/9/22 19:26
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {

        // 空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false ;
    }
}
