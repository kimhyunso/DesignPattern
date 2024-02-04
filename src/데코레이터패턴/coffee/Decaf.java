package 데코레이터패턴.coffee;

import 데코레이터패턴.domain.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
