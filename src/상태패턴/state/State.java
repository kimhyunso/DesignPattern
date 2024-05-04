package 상태패턴.state;

import java.io.Serializable;

public interface State extends Serializable{
    public void insertCoin();
    public void ejectCoin();
    public void turnCoin();
    public void dispense();
    public void refill();
}
