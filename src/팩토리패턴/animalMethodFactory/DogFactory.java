package 팩토리패턴.animalMethodFactory;

import 팩토리패턴.animalMethodFactory.domain.Animal;
import 팩토리패턴.animalMethodFactory.domain.Dog;

public class DogFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    public void makeWings(){
        System.out.println("add Wings");
    }

}