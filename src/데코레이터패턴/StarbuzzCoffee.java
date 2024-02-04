package 데코레이터패턴;

import 데코레이터패턴.add.Mocha;
import 데코레이터패턴.add.Soy;
import 데코레이터패턴.add.Whip;
import 데코레이터패턴.coffee.DarkRoast;
import 데코레이터패턴.coffee.Espresso;
import 데코레이터패턴.coffee.HouseBlend;
import 데코레이터패턴.domain.Beverage;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf(beverage.getDescription() + " $%.2f\n", beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage);
        System.out.printf(beverage2.getDescription() + " $%.2f\n", beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf(beverage3.getDescription() + " $%.2f\n", beverage3.cost());
    }

}
