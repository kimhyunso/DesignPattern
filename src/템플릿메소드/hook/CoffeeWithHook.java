package 템플릿메소드.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");        
    }

    @Override
    public void addCondiments() {
        System.out.println("우유와 설탕을 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().equals("y")){
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.print("커피에 우유와 설탕을 넣을까요? (y/n)? ");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();

        }catch(IOException e){
            System.err.println("IO 오류");
        }

        if (answer == null){
            return "no";
        }

        return answer;
    }


}