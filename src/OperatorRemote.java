import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OperatorRemote extends UnicastRemoteObject implements MathOperator{
    public OperatorRemote() throws RemoteException{
        super();
    }

    @Override
    public int mul(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public float div(int a, int b) throws RemoteException {
        return a*1.0f/b;
    }
}
