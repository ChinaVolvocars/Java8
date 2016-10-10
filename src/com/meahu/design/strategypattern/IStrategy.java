package com.meahu.design.strategypattern;

/**
 * Created by idea on 2016/10/10.
 * 策略接口，这是诸葛亮给赵云的三个锦囊妙计的接口
 */
public interface IStrategy {
    //每个精囊妙计都是一个可以执行的算法
    public void operate();
}
