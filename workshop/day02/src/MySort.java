import java.util.ArrayList;
import java.util.List;

public class MySort {
    public List<Integer> sort(List<Integer> input) {
        if((input.size() > 1) && (input.get(0) > input.get(1))) {
            // Swap
            int temp = input.get(0);
            input.set(0, input.get(1));
            input.set(1, temp);
        }
        return input;
    }
}
