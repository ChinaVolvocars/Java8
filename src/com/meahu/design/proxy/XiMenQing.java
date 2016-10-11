package com.meahu.design.proxy;

/**
 * Created by idea on 2016/10/10.
 */
public class XiMenQing {

    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.happyWithMan();
        wangPo1.makeEyesWithMan();

    }
}
