package com.meahu.design.strategypattern;

/**
 * Created by idea on 2016/10/10.
 * 装妙计的锦囊
 */
public class Context {

    private final IStrategy strategy;

    //构造函数，要使用哪一个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋，看我出招了
    public void opreate() {
        strategy.operate();
    }
}
