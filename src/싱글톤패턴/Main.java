public class Main {
    public static void main(String[] args){
        ChocolateBoiler insternce1 = ChocolateBoiler.getInstance();
        ChocolateBoiler insternce2 = ChocolateBoiler.getInstance();
        
        insternce1.fill();
        insternce2.boil();
        insternce1.drain();

        
        if (insternce1.isBoiled()){
            System.out.println("재료가 끓는 중");
        }
    
    }
}
