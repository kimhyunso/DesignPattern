package 상태패턴;

public class GumballMachineTestDrive {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(3);

        System.out.println(gumballMachine);
        gumballMachine.insertCoin();
        gumballMachine.turnCoin();
        System.out.println();

        System.out.println(gumballMachine);
        gumballMachine.insertCoin();
        gumballMachine.turnCoin();
        gumballMachine.insertCoin();
        gumballMachine.turnCoin();
        System.out.println();

        System.out.println(gumballMachine);
        gumballMachine.refill(3);
        System.out.println();

        System.out.println(gumballMachine);
    }
}
