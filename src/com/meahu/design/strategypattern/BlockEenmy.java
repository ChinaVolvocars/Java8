package com.meahu.design.strategypattern;

/**
 * Created by idea on 2016/10/10.
 * 孙夫人断后，挡住追兵
 */
public class BlockEenmy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
