package 커맨드패턴.receiver;

public class Light {
    private String location;

    public Light(String location){
        this.location = location;
    }
    
    public void on(){
        System.out.println(location + " 조명 켜기");
    }

    public void off(){
        System.out.println(location + " 조명 끄기");
    }
    
}
