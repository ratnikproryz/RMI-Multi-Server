import java.rmi.Naming;

public class SecondServer {
    public static void main(String[] args) {
        try {
            MathOperator stub = new OperatorRemote();
            Naming.rebind("rmi://localhost:5000/div", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
