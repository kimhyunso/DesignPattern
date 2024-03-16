public enum EnumSingleton {
    UNIQUE_INSTANCE;
    private boolean empty;
    private boolean boiled;

    public void fill(){ // 보일러가 비어있을 때 재료를 넣음
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    
    public void boil(){
        if (!isEmpty() && !isBoiled()){
            // 재료를 끓임
            boiled = true;
        }
    }

    public void drain(){ 
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
