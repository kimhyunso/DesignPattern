package 어댑터패턴.adapter;

import 어댑터패턴.adaptee.Turkey;
import 어댑터패턴.client.Duck;

public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }


    @Override
    public void quack(){
        turkey.gobble();
    }

    @Override
    public void fly(){
        // 칠면조를 오리와 비슷하게 날르게 하기 위해 for문 사용
        for(int i=0; i<5; i++){
            turkey.fly();
        }
    }
}