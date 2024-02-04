package 데코레이터패턴.domain;

public abstract class Beverage {
    protected Size size = Size.TALL;
    protected String description = "제목 없음";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
