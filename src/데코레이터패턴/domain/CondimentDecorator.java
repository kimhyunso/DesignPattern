package 데코레이터패턴.domain;

import 데코레이터패턴.domain.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();

}
