package 프록시패턴;

import java.rmi.Naming;

public class RmiRegistry {

    public static void main(String[] args){
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
