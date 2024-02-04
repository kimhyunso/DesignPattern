package 데코레이터패턴.add;

import 데코레이터패턴.domain.CondimentDecorator;
import 데코레이터패턴.domain.Beverage;
import 데코레이터패턴.domain.Size;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost() + .10;

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
        return getDescription() + ", 우유";
    }
}
