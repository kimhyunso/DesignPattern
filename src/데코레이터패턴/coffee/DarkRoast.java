package 데코레이터패턴.coffee;

import 데코레이터패턴.domain.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        return .99;
    }
}
