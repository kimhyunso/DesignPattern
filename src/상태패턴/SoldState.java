package 상태패턴;

import 상태패턴.state.State;

public class SoldState implements State{

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("알맹이를 내보내는 중");
    }

    @Override
    public void ejectCoin() {
        System.out.println("이미 알맹이를 뽑으셨어요");
    }

    @Override
    public void turnCoin() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoCoinState());
        }else{  
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
    
    @Override
    public String toString(){
        return "판매상태";
    }
    
    @Override
    public void refill() {
        System.out.println("아무것도 하지 않아용...");
    }

}
