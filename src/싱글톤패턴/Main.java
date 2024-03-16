
public class Main {
    public static void main(String[] args){
        ChocolateBoiler instance1 = ChocolateBoiler.getInstance();
        ChocolateBoiler instance2 = ChocolateBoiler.getInstance();
        
        instance1.fill();
        instance2.boil();
        instance1.drain();

        
        if (instance1.isBoiled()){
            System.out.println("재료가 끓는 중");
        }

        EnumSingleton instance3 = EnumSingleton.UNIQUE_INSTANCE;
        EnumSingleton instance4 = EnumSingleton.UNIQUE_INSTANCE;

        instance3.fill();
        instance4.boil();
        instance3.drain();
        
        if (instance3.isBoiled()){
            System.out.println("재료가 끓는 중");
        }
    }
}
