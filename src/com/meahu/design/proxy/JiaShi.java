package com.meahu.design.proxy;

/**
 * Created by idea on 2016/10/10.
 */
public class JiaShi implements KingWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("JiaShi抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("JiaShi Happy");
    }

    public void play() {
        System.out.println("漂亮");
    }
}
