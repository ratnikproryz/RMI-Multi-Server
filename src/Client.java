import java.rmi.Naming;

public class Client {
    public static void main(String args[]) {
        try {
            int a=34, b=4;
            MathOperator stub = (MathOperator) Naming.lookup("rmi://localhost:5000/mul");
            System.out.println(a+" * "+b+" = "+stub.mul(a,b));
            stub = (MathOperator) Naming.lookup("rmi://localhost:5000/div");
            System.out.println(a+" / "+b+" = "+stub.div(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
