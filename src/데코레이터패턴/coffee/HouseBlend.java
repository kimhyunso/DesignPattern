package 데코레이터패턴.coffee;

import 데코레이터패턴.domain.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
