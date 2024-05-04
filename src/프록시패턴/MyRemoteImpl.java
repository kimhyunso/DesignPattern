package 프록시패턴;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    private static final long serialVersionUID = 1L;


    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args){
         try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://localhost:1090/RemoteHello", service);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
    
}

