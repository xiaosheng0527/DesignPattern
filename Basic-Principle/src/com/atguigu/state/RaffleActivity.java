package com.atguigu.state;

/**
 * 抽奖活动 //
 * 
 * @author Administrator
 *
 */

// 角色：ContextConcrete【状况，前后关系，上下文】
// ContextConcrete角色持有表示当前状态的 ConcreteState角色。【聚合】
// 此外，它还定义了提供外部调用者使用State模式的类。【注意：这里并没有定义Context接口】
//      直接将 四个属性直接 组合 到 实例属性，
// 综上：RaffleActivity：抽奖活动
//           作为 ContextConcrete角色 持有 当前状态的 ConcreteState角色
// 而且 RaffleActivity 类 里面有些 方法 会依赖 State【状态接口】 的 方法 【eg:deductMoney(),raffle(),dispensePrize()】
// 所以这里尽量对每个依赖项都要进行 合理的 综合 处理，即抽出 公共的方法，这里是【eg：debuctMoney(),raffle()】
// 综上：从这里我们可以看出  RaffleActivity 和 ConcreteState类 是 呈现 "关联" 的 关系
// 注意："关联"关系：其实是 要么是 双方 相互 "依赖" 或 双方 相互 "聚合"
public class RaffleActivity {

	// state 表示活动当前的状态，是变化
    State state = null;
    // 奖品数量
    int count = 0;
    
    // 四个属性，表示四种状态 ，这里 四种状态类 都聚合到 RaffleActivity
    State noRafflleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    
    State dispenseState =   new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量 
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //扣分, 调用当前状态的 deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    //抽奖 
    public void raffle(){
    	// 如果当前的状态是抽奖成功
        if(state.raffle()){
        	//领取奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    // 给代表状态的字段赋予表示当前状态的类的实例，就相当于进行了状态转移
    public void setState(State state) {
        this.state = state;
    }

    //这里请大家注意，每领取一次奖品，count--
    public int getCount() {
    	int curCount = count; 
    	count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
