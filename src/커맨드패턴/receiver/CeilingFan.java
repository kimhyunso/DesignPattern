package 커맨드패턴.receiver;

public class CeilingFan{

    private String location;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;

    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " 의 속도가 HIGH로 설정되었습니다.");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " 의 속도가 MEDIUM으로 설정되었습니다.");

    }

    public void low(){
        speed = LOW;
        System.out.println(location + " 의 속도가 LOW로 설정되었습니다.");
    }

    public void on(){
        speed = LOW;
        System.out.println(location + " is on");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " is off");
    }

    public int getSpeed(){
        return speed;
    }


}