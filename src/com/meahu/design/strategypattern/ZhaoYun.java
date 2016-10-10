package com.meahu.design.strategypattern;

import sun.applet.Main;

/**
 * Created by idea on 2016/10/10.
 */
public class ZhaoYun {
    /**
     * 赵云来了，依次使用妙计
     */
    public static void main(String[] args) {
        Context context;

        System.out.println("----------------打开第一个妙计---------------");
        context = new Context(new BackDoor());
        context.opreate();
        System.out.println("\n");

        System.out.println("------------------打开第二个-------------------");
        context = new Context(new GivenGreenLight());
        context.opreate();
        System.out.println("\n");

        System.out.println("---------------打开第三个----------------------");
        context = new Context(new BlockEenmy());
        context.opreate();
        System.out.println("\n");

    }
}
