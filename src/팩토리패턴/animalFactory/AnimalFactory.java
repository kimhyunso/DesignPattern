public class AnimalFactory{
    public Animal getAnimal(String type){
        if (type == null){
            return null;
        }
        if (type.equalsIgnoreCase("CAT")){
            return new Cat();
        }else if (type.equalsIgnoreCase("DOG")){
            return new Dog();
        }
        return null;
    }
}