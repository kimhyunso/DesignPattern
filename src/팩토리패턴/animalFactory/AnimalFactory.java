public class AnimalFactory{
    public Animal getAnimal(AnimalType type){
        if (type == null){
            return null;
        }

        if (type.equals(AnimalType.CAT)){
            return new Cat();
        }else if (type.equals(AnimalType.DOG)){
            return new Dog();
        }
        return null;
    }
}