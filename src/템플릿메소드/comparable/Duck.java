package 템플릿메소드.comparable;

public class Duck implements Comparable<Duck>{

    private String name;
    private int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return name + " 체중 : " + weight;
    }


    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight){
            return -1;
        }else if (this.weight == otherDuck.weight){
            return 0;
        }else { // this.weight > otherDuck.weight
            return 1;
        }
    }
    
}
