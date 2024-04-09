package 퍼사드패턴;

public class PopcornPopper{
    
    public void on(){
        System.out.println("팝콘 기계 작동");
    }

    public void off(){
        System.out.println("팝콘 기계 전원 종료");
    }

    public void pop(){
        System.out.println("팝콘 튀기기");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getName() + "] 팝콘클래스");
        return sb.toString();
    }

}