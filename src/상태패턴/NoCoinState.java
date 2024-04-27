package 상태패턴;

import 상태패턴.state.State;

public class NoCoinState implements State{

    private GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void turnCoin() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public String toString(){
        return "코인이 없는 상태";
    }

    @Override
    public void refill() {
        System.out.println("아무것도 하지 않아용...");
    }

    
}
