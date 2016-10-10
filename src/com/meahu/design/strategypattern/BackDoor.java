package com.meahu.design.strategypattern;

/**
 * Created by idea on 2016/10/10.
 * 找乔国老帮忙，是孙权不杀刘备
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
