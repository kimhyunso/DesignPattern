package 퍼사드패턴;

public class StreamingPlayer{
    private Amplifier amplifier;
    private String movie;
    private boolean isFlag;

    public StreamingPlayer(Amplifier amplifier){
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("실시간 스트리밍 플레이어 켜기");
        isFlag = true;
    }

    public void off(){
        System.out.println("실시간 스트리밍 플레이어 끄기");
        isFlag = false;
    }

    public void play(String movie){
        this.movie = movie;
        System.out.println("스트리밍 플레이어에서 \"" + movie + "\" 를 재생합니다.");
    }

    public void stop(){
        System.out.println("\"" + movie + "\" 재생 종료" );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("스트리밍 플레이어 상태 : ");
        if (isFlag) {
            sb.append("on");
            sb.append("재생 중인 영화 : " + movie);
        }else sb.append("off");
        return sb.toString();
    }

}