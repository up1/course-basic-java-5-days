import static java.lang.System.*;

public class HelloWorld {

    public static void main(String[] args) {
        String input = "10";
        int r1 = Integer.parseInt(input);
        int r2 = Integer.valueOf(input);
        String s1 = String.valueOf(1 + 1);
        String s2 = 1 + "" + 1;

        int a = 20;
        String s = a + "";

        // Default Constructor
        HelloWorld p1 =  new HelloWorld();
        HelloWorld p2 = new HelloWorld();
        out.println(p1);
        out.println(p2);
        p1.sayHi();
        int result = p1.calulate();
    }

    private int calulate() {
        // Call other class
        Other other = null;
        if(other != null) {
            other.call();
        }
        return 0;
    }
    private void sayHi() {
        int d = 10;
    }


}
