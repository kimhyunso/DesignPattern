package 전략패턴.domain;

import 전략패턴.fly.FlyNoWay;
import 전략패턴.quack.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("가짜 오리당");
    }
}
