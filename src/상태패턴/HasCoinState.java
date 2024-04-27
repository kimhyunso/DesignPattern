package 상태패턴;

import java.util.Random;

import 상태패턴.state.State;

public class HasCoinState implements State{

    private GumballMachine gumballMachine;
    private Random randomWinner = new Random(System.currentTimeMillis());

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
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }

    @Override
    public String toString(){
        return "코인이 들어있는 상태";
    }

    @Override
    public void refill() {
        System.out.println("아무것도 하지 않아용...");
    }
}
