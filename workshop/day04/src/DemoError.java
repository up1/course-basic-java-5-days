public class DemoError {
    public static void main(String[] args) {
        // NPE
        Demo demo = null;
        demo.call();
        // ArithmeticException
        int a = 1/0;
        System.out.println("Result = " + a);
    }
}

class Demo {
    void call(){}
}
