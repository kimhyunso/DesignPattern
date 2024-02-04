package 전략패턴.domain;

import 전략패턴.fly.FlyBehavior;
import 전략패턴.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("오리들은 물에 뜬다요~");
    }
}
