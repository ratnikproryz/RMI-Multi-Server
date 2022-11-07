import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathOperator extends Remote {
    public int mul(int a, int b) throws RemoteException;
    public float div(int a,int b) throws RemoteException;
}
