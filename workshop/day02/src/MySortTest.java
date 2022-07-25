import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    public void case01() {
        MySort mySort = new MySort();
        List<Integer> input = new ArrayList<>();
        input.add(1);

        List<Integer> result = mySort.sort(input);

        assertEquals(input, result);
    }

    @Test
    public void case02() {
        MySort mySort = new MySort();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);

        List<Integer> result = mySort.sort(input);

        assertEquals(input, result);
    }

    @Test
    public void case03() {
        MySort mySort = new MySort();
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        List<Integer> result = mySort.sort(input);

        assertEquals(expected, result);
    }

}