package 데코레이터패턴.coffee;

import 데코레이터패턴.domain.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
