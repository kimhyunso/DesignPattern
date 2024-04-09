package 퍼사드패턴;

public class TheaterLights{

    private int dim;

    public void on(){

    }

    public void off(){

    }

    public void dim(int dim){
        this.dim = dim;
        System.out.println("조명 밝기 : " + this.dim + "%");

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}