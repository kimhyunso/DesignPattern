package 템플릿메소드;

public class Tea extends CaffeineBeverage{

    @Override
    public void addCondiments() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    public void brew() {
        System.out.println("레몬을 추가하기");        
    }
}