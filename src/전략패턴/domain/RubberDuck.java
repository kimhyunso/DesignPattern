package 전략패턴.domain;

import 전략패턴.fly.FlyNoWay;
import 전략패턴.quack.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("고무 오리 입니당~");
    }
}
