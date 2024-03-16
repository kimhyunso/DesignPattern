public class ChocolateBoiler{
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    // 1
    public void fill(){ // 보일러가 비어있을 때 재료를 넣음
        if (isEmpty()){
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }
    
    // 2
    // 보일러가 가득 차 있고 아직 끓지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓임
    // 재료를 다 끓이면 boiled 플래그를 true로 만듬
    public void boil(){
        if (!isEmpty() && !isBoiled()){
            // 재료를 끓임
            boiled = true;
        }
    }

    // 3
    // 보일러가 가득 차 있고, 다 끓여진 상태에서만 보일러에 들어있는 재료를 다음 단계로 넘김
    // 보일러를 다 비우고 나면 empty 플래그를 다시 true로 만듬
    public void drain(){ 
        if (!isEmpty() && isBoiled()){
            // 끓인 재료를 다음 단계로 넘김
            empty = true;
        }
    }

    public static synchronized ChocolateBoiler getInstance(){
        if (instance == null){
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

}