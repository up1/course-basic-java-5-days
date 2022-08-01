import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void success_case() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(8,2);
        assertEquals(4, result);
    }

    @ParameterizedTest
    @CsvSource( {
            "8, 2, 4",
            "4, 2, 2",
            "2, 1, 2"
    })
    public void success_case02(int a,
                               int b,
                               double expected) {
        Calculator calculator = new Calculator();
        double result = calculator.divide(a, b);
        assertEquals(expected, result);
    }

}