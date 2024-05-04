package 프록시패턴;

import java.rmi.Remote;
import java.rmi.RemoteException;

import 상태패턴.state.State;

public interface GumballMachineRemote extends Remote{
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
