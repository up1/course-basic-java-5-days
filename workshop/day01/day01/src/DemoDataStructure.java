import java.util.*;

public class DemoDataStructure {
    // 1. Array = []
    // 2. List = dynamic array
    // 3. Map =  key-value
    public static void main(String[] args) {
        Map<Integer, String> customerMap = new HashMap<>();
        customerMap.put(1, "customer 1");
        customerMap.put(2, "customer 2");
        customerMap.put(2, "customer 3");
        if(customerMap.containsKey(1)){
            System.out.println("found 1");
        }
        for (String value : customerMap.values()) {
            System.out.println(value);
        }
        Set<Integer> keys = customerMap.keySet();
        for (Integer key : keys) {
            System.out.println(customerMap.get(key));
        }
    }

    private static void doList() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("123");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
