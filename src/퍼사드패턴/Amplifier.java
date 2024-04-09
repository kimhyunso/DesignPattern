package 퍼사드패턴;

public class Amplifier{
    private Tuner tuner;
    private StreamingPlayer player;

    public void on(){

    }

    public void off(){

    }

    public void setStreamPlayera(StreamingPlayer player){
        this.player = player;
    }

    public void setStereoSound(){

    }

    public void setTuner(){

    }

    public void setVolumn(int volumn){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}