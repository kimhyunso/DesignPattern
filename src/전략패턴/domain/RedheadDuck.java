package 전략패턴.domain;

import 전략패턴.fly.FlyWithWings;
import 전략패턴.quack.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("붉은머리 오리에용");
    }
}
