package 팩토리패턴.animalMethodFactory;

import 팩토리패턴.animalMethodFactory.domain.Animal;
import 팩토리패턴.animalMethodFactory.domain.Cat;

public class CatFactory implements AnimalFactory{

    private int catCount = 0;

    @Override
    public Animal createAnimal() {
        catCount += 1;
        return new Cat();
    }

    public int getCatCount(){
        return catCount;
    }
}