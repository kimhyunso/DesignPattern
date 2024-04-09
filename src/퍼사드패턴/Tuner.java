package 퍼사드패턴;

public class Tuner{
    private Amplifier amplifier;

    public void on(){
        System.out.println("튜너 켜기");
    }

    public void off(){
        System.out.println("튜너 끄기");
    }

    public void setAm(Amplifier amplifier){
        this.amplifier = amplifier;
    }

    public void setFm(){
        
    }

    public void setFrequency(int frequency){
        System.out.println("주파수 조절 : " + frequency + "Hz");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}