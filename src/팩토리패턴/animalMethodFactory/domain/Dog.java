package 팩토리패턴.animalMethodFactory.domain;

public class Dog extends Animal{

    @Override
    public void speak(){
        System.out.println("멍멍");
    }

}