package 전략패턴;

import 전략패턴.domain.Duck;
import 전략패턴.domain.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
