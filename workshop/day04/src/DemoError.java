public class DemoError {
    public static void main(String[] args) {
        // ArithmeticException
        int a = -1;
        int b = 0;
        if (b > 0) {
            a = 1 / b;
        }
        System.out.println("Result1 = " + a);

        a = -2;
        try {
            //  Normal process
            a = 1 + 2;
            a = 1 / b;
            a  = 0;
        } catch (ArithmeticException e) {
            // TODO
            a = -1;
        } catch (Exception e) {
            // TODO
            a = -1;
        } finally {
            System.out.println("In finally");
        }
        System.out.println("Result2 = " + a);
    }

    public static void main2(String[] args) {
        // NPE
        Demo demo = null;
        // Defensive
        if (demo != null) {
            demo.call();
        }
        // Fail fast
        if (demo == null) {
            try {
                throw new Exception("fffff");
            } catch (Exception e) {
                e.printStackTrace(); // Don't use in production !!
            } finally {

            }
        }
        demo.call();


        // ArithmeticException
        int a = 1 / 0;
        System.out.println("Result = " + a);
    }
}

class Demo {
    void call() {
    }
}
