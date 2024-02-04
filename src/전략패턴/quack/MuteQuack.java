package 전략패턴.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<조용>>");
    }
}
