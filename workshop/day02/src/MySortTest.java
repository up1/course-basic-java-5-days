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
        List<Integer> input = toList(2, 1);
        List<Integer> expected = toList(1, 2);

        List<Integer> result = mySort.sort(input);

        assertEquals(expected, result);
    }

    @Test
    public void case04() {
        MySort mySort = new MySort();
        List<Integer> input = toList(1, 3, 2);
        List<Integer> expected = toList(1, 2, 3);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    public void case05() {
        MySort mySort = new MySort();
        List<Integer> input = toList(3, 2, 1);
        List<Integer> expected = toList(1, 2, 3);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }
    private List<Integer> toList(int...items) { // varargs
        List<Integer> result = new ArrayList<>();
        for (int item : items) {
            result.add(item);
        }
        return result;
    }

}