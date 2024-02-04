package 전략패턴.fly;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("날아요~");
    }
}
