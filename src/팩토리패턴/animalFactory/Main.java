public class Main{

    public static void main(String args[]){
        Animal animal = null;
        AnimalFactory factory = new AnimalFactory();
        animal = factory.getAnimal("DOG");
        animal.speak();

        animal = factory.getAnimal("CAT");
        animal.speak();
    }
}