package com.meahu.design.strategypattern.nba;

/**
 * Created by idea on 2016/10/10.
 */
public class Junior implements NbaStrategy {
    @Override
    public int selectedPlayers(int price) {
//        System.out.println("初级球员价格价格");
        return price * 1;
    }
}
