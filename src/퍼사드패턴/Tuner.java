package 퍼사드패턴;

public class Tuner{
    private Amplifier amplifier;

    public void on(){

    }

    public void off(){

    }

    public void setAm(Amplifier amplifier){
        this.amplifier = amplifier;
    }

    public void setFm(){
        
    }

    public void setFrequency(){
        System.out.println("주파수 조절");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}