import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRange2Test {

    @Test
    @DisplayName("ตรวจสอบตัวเริ่มต้นว่าเป็น [ หรือไม่")
    public void case01() {
        MyRange2 range = new MyRange2("[1,5]");
        boolean result = range.startWithKeep();
        assertTrue(result);
    }

    @Test
    @DisplayName("ตรวจสอบตัวเริ่มต้นว่าเป็น ( หรือไม่")
    public void case02() {
        MyRange2 range = new MyRange2("(1,5]");
        boolean result = range.startWithKeep();
        assertFalse(result);
    }

}