public class DemoError2 {
    public static void main(String[] args) {
        try {
            Calculator calculator  = new Calculator();
            double result = calculator.divide(1, 0);
        } catch (CalculatorDivideWithZeroException e) {
            e.printStackTrace();
        }
        System.out.println("Result = " + result);
    }
}
class Calculator {
    double divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            throw new CalculatorDivideWithZeroException();
        }
    }
}
