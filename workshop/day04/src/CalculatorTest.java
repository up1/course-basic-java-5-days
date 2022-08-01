import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void success_case() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(8,2);
        assertEquals(4, result);
    }

}