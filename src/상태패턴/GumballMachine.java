package 상태패턴;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import 상태패턴.state.State;
import 프록시패턴.GumballMachineRemote;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

    private static final long serialVersionUID = 2L;
    private State soldOutState;
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State winnerState;
    private State state = soldOutState;
    private int count;
    private String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException{
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        this.location = location;
        
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

    public void refill(int count){
        this.count += count;
        state.refill();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    @Override
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
    
    @Override
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("주식회사 왕뽑기\n");
        sb.append("자바로 돌아가는 최신형 뽑기 기계\n");
        sb.append("남은 개수 : " + getCount() + "\n");
        sb.append(getState().toString());

        return sb.toString();
    }

    @Override
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
