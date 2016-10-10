package com.meahu.design.strategypattern;

/**
 * Created by idea on 2016/10/10.
 * 求吴国太开个绿灯
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
