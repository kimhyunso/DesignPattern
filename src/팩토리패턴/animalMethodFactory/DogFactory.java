package 팩토리패턴.animalMethodFactory;

import 팩토리패턴.animalMethodFactory.domain.Animal;
import 팩토리패턴.animalMethodFactory.domain.Dog;

public class DogFactory implements AnimalFactory{

    private Dog dog;


    @Override
    public Animal createAnimal() {
        dog = new Dog();
        return dog;
    }

    public Dog makeWings(){
        System.out.println("add Wings");
        return dog;
    }

}