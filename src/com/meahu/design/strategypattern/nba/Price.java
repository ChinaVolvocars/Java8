package com.meahu.design.strategypattern.nba;

/**
 * Created by idea on 2016/10/10.
 * 计算球员的价格
 */
public class Price {

    private NbaStrategy strategy;

    public Price(NbaStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int price) {
        return strategy.selectedPlayers(price);
    }

}
