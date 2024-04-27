package 상태패턴;

import 상태패턴.state.State;

public class WinnerState implements State{

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("알맹이 내보내는 중...");
    }

    @Override
    public void ejectCoin() {
        System.out.println("이미 손잡이를 돌렸습니다...");
    }

    @Override
    public void turnCoin() {
        System.out.println("알맹이를 내보내고 있으니 기다려주세요...");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            System.out.println("축하드려용 알맹이 하나 더 드림요");
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoCoinState());
            }else{
                System.out.println("더 이상 알맹이가 없어요...");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public String toString(){
        return "잭팟!!";
    }

    
    @Override
    public void refill() {
        System.out.println("아무것도 하지 않아용...");
    }
    
}
