package 템플릿메소드.abstractList;

import java.util.List;

public class MyStringTestDrive {

    public static void main(String[] args){
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        List ducksSubList = ducksList.subList(2, 3);
        System.out.println(ducksSubList);
    }
    
}
