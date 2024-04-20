package 상태패턴;

import 상태패턴.state.State;

public class HasCoinState implements State{

    private GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("동전 그만 넣어주세요.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전 반환해드립니다.");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public void turnCoin() {
        System.out.println("손잡이를 돌립니다.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
}
