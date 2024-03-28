package 커맨드패턴.receiver;

public class CeilingFan{

    private String location;

    public CeilingFan(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " is on");
    }

    public void off(){
        System.out.println(location + " is off");
    }
}