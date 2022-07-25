import java.util.*;

class MySortComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -1;
    }
}
public class MySort {
    public List<Integer> sort(List<Integer> input) {
        Collections.sort(input, new MySortComparator());
        Collections.sort(input);
//        for (int i = 0; i < input.size() - 1; i++) {
//            if (input.get(i) > input.get(i + 1)) {
//                // Swap
//                int temp = input.get(i);
//                input.set(i, input.get(i + 1));
//                input.set(i + 1, temp);
//            }
//        }
        return input;
    }

    public static void main(String[] args) {
        if (false)
            System.out.println("Line 1");
        System.out.println("Line 2");
    }
}
