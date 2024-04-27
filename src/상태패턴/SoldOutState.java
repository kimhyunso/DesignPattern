package 상태패턴;

import 상태패턴.state.State;

public class SoldOutState implements State{
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("매진입니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전 반환안대용 동전을 넣지 않았어요.");
    }

    @Override
    public void turnCoin() {
        System.out.println("매진입니다.");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }

    @Override
    public String toString(){
        return "매진상태";
    }

    
    @Override
    public void refill() {
        System.out.println("리필중입니다..");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
    
}
