import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    void case01() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.print(2);
        assertEquals("2", result);
    }

    @Test
    void case02() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.print(2);
        assertEquals("2", result);
    }

}