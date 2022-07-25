import java.util.ArrayList;
import java.util.List;

public class MySort {
    public List<Integer> sort(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        if((input.size() > 1) && (input.get(0) > input.get(1))) {
            // Swap
            result.add(input.get(1));
            result.add(input.get(0));
        } else {
            result = input;
        }
        return result;
    }
}
