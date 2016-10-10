package com.meahu.design.strategypattern.nba;

/**
 * Created by idea on 2016/10/10.
 */
public class Intermediate implements NbaStrategy {
    @Override
    public int selectedPlayers(int price) {
//        System.out.println("中级球员价格");
        return price * 2;
    }
}
