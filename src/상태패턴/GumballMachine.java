package 상태패턴;

import 상태패턴.state.State;

public class GumballMachine {

    private State soldOutState;
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    
    private State state = soldOutState;

    private int count;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0){
            state = noCoinState;
        }else{
            state = soldOutState;
        }
    }

    public void insertCoin(){
        state.insertCoin();
    }

    public void ejectCoin(){
        state.ejectCoin();
    }
    public void turnCoin(){
        state.turnCoin();
        state.dispense();
    }

    void releaseBall(){
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0){
            count -= 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount(){
        return count;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(State noCoinState) {
        this.noCoinState = noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(State hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
}
