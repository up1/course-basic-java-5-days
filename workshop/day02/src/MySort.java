import java.util.ArrayList;
import java.util.List;

public class MySort {
    public List<Integer> sort(List<Integer> input) {
            /*
            [1, 3], 2 => 1, 3, 2
            1, [3, 2] => 1, 2, 3
             */
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i) > input.get(i + 1)) {
                // Swap
                int temp = input.get(i);
                input.set(i, input.get(i + 1));
                input.set(i + 1, temp);
            }
        }
        return input;
    }

    public static void main(String[] args) {
        if(false)
            System.out.println("Line 1");
            System.out.println("Line 2");
    }
}
