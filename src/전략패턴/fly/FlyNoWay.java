package 전략패턴.fly;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("못 날아요~");
    }
}
