package 퍼사드패턴;

public class Amplifier{
    private Tuner tuner;
    private StreamingPlayer player;
    private boolean isFlag;
    private int volumn;

    public void on(){
        System.out.println("앰프 켜기");
        isFlag = true;
    }

    public void off(){
        System.out.println("앰프 끄기");
        isFlag = false;
    }

    public void setStreamPlayer(StreamingPlayer player){
        this.player = player;
        System.out.println("앰프를 스트리밍 플레이어와 연결");
    }

    public void setStereoSound(){
        System.out.println("앰프를 스테리오 모드로 설정");
    }

    public void setSurroundSound(){
        System.out.println("앰프를 서라운드 모드로 설정 (5.1채널)");
    }

    public void setTuner(Tuner tuner){
        this.tuner = tuner;
        System.out.println("앰프와 튜너를 연결");
    }

    public void setVolumn(int volumn){
        System.out.println("앰플 볼륨 : " + volumn);
        this.volumn = volumn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("앰플 상태 : ");
        
        if (isFlag) sb.append("on");
        else sb.append("off");
        
        sb.append("앰플 볼륨 : " + volumn);
        return sb.toString();
    }
}