package 데코레이터패턴.add;

import 데코레이터패턴.domain.CondimentDecorator;
import 데코레이터패턴.domain.Beverage;
import 데코레이터패턴.domain.Size;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {

        double cost = beverage.cost() + .20;

        if (beverage.getSize() == Size.TALL){
            cost += .10;
        }else if (beverage.getSize() == Size.GRANDE){
            cost += .15;
        }else if (beverage.getSize() == Size.VENTI){
            cost += .20;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

}
