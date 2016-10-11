package com.meahu.design.proxy;

/**
 * Created by idea on 2016/10/10.
 */
public class WangPo implements KingWomen {
    private KingWomen kingWomen;

    public WangPo() {
        this.kingWomen = new PanJinLian();
    }

    public WangPo(KingWomen kingWomen) {
        this.kingWomen = kingWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kingWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kingWomen.happyWithMan();
    }
}
