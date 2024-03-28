package 커맨드패턴.receiver;

public class Stereo{
    private int volumn;
    private String location;

    public Stereo(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("소리 재생");
    }

    public void off(){
        System.out.println("소리 끄기");
    }

    public void setCD(){
        System.out.println("CD 삽입");
    }

    public void setRadio(){

    }

    public void setVolumn(int volumn){
        this.volumn = volumn;
        System.out.println("현재 볼륨 : " + volumn);
    }
}