package 커맨드패턴.receiver;

public class GarageDoor {

    public void up(){
        System.out.println("차고 문열기");
    }

    public void down(){
        System.out.println("차고 문닫기");
    }

    public void stop(){
        System.out.println("차고 문 멈추기");
    }

    public void lightOn(){
        System.out.println("차고 불켜기");
    }

    public void lightOff(){
        System.out.println("차고 불끄기");
    }

}
