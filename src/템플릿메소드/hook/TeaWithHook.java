package 템플릿메소드.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{



    @Override
    public void addCondiments() {
        System.out.println("홍차에 레몬을 추가합니다.");
    }

    @Override
    public void brew() {
        System.out.println("홍차를 우려냅니다.");
        
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

        System.out.print("홍차에 레몬즙을 넣을까요? (y/n)? ");
        
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