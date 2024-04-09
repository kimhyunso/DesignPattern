package 퍼사드패턴;

public class Projector{
    private StreamingPlayer player;

    public Projector(StreamingPlayer player){
        this.player = player;
    }

    public void on(){
        System.out.println("프로젝터 켜기");
    }

    public void off(){
        System.out.println("프로젝터 끄기");
    }

    public void tvMode(){
        System.out.println("TV 모드로 전환");
    }

    public void wideScreenMode(){
        System.out.println("와이드 스크린 모드로 전환");
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("== [" + player.getClass().getName() + "] ==");
        sb.append("== [" + this.getClass().getName() + "] ==");
        return sb.toString();
    }

}