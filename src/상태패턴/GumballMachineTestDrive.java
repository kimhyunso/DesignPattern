package 상태패턴;

public class GumballMachineTestDrive {

    public static void main(String[] args){
        String arg[] = {"Austin", "3"};
        int count = 0;

        if (arg.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(arg[1]);
        GumballMachine gumballMachine = new GumballMachine(arg[0], count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        
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
        monitor.report();
    }
}
