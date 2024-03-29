package 팩토리패턴.animalMethodFactory;

import 팩토리패턴.animalMethodFactory.domain.Animal;
import 팩토리패턴.animalMethodFactory.domain.Cat;
import 팩토리패턴.animalMethodFactory.domain.Dog;

public class Main{

    public static void main(String[] args){
        Animal animal = null;
        CatFactory catFactory = new CatFactory();
        animal = catFactory.createAnimal();
        catFactory.createAnimal();
        catFactory.createAnimal();
        animal.speak();
        System.out.println("cat count = " + catFactory.getCatCount());

        DogFactory dogFactory = new DogFactory();
        animal = dogFactory.createAnimal();
        animal = dogFactory.makeWings(animal);
        animal.speak();
    }

}