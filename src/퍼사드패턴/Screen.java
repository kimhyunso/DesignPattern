package 퍼사드패턴;

public class Screen{
    public void up(){
        System.out.println("스크린 올리기");
    }

    public void down(){
        System.out.println("스크린 내리기");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}