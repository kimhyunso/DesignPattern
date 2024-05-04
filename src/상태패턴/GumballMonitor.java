package 상태패턴;

import 프록시패턴.GumballMachineRemote;

public class GumballMonitor{
    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine){
        this.machine = machine;
    }

    public void report(){
        try{
            System.out.println("뽑기 기계 위치 : " + machine.getLocation());
            System.out.println("현재 재고 : " + machine.getCount() + " 개");
            System.out.println("현재 상태 " + machine.getState());
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}