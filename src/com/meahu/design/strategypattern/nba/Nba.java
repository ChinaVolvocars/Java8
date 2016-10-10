package com.meahu.design.strategypattern.nba;

/**
 * Created by idea on 2016/10/10.
 */
public class Nba {

    public static void main(String[] args) {
        Junior junior = new Junior();
        Intermediate intermediate = new Intermediate();
        Advanced advanced = new Advanced();

        System.out.println("-----------湖人------------------");
        int huren=300;
        Price price = new Price(junior);
        System.out.println("湖人初级：" + price.calculate(huren));
        Price price1 = new Price(intermediate);
        System.out.println("湖人中级：" + price1.calculate(huren));
        Price price2 = new Price(advanced);
        System.out.println("湖人高级：" + price2.calculate(huren));
        System.out.println("\n");

        System.out.println("-----------热火------------------");
        int rehuo=600;
        Price priceA = new Price(junior);
        System.out.println("热火初级：" + price.calculate(rehuo));
        Price priceB = new Price(intermediate);
        System.out.println("热火中级：" + price1.calculate(rehuo));
        Price priceC = new Price(advanced);
        System.out.println("热火高级：" + price2.calculate(rehuo));
        System.out.println("\n");

    }
}
