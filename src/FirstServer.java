import java.rmi.Naming;

public class FirstServer {
    public static void main(String[] args) {
        try {
            MathOperator stub = new OperatorRemote();
            Naming.rebind("rmi://localhost:5000/mul", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
