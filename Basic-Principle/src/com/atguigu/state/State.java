package com.atguigu.state;

/**
 * 状态抽象类
 * @author Administrator
 *
 */

// State角色表示状态，定义了根据不同状态进行不同处理的接口。
// 该接口是那些 处理内容 依赖于 状态的方法的集合

// 注意：在State接口中声明的所有方法 都是 "依赖于状态的处理，状态不同处理也不同"
public abstract class State {

	
	// 扣除积分 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract  void dispensePrize();

}
