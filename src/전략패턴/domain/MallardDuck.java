package 전략패턴.domain;

import 전략패턴.fly.FlyWithWings;
import 전략패턴.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
