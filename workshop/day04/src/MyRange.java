public class MyRange {
    public static void main(String[] args) {
        String input = "[1,5]";
        String output = "";
        // 1, 2 [ => true, ( => false
        boolean isKeep = false;
        if(input.charAt(0) == '[') {
            isKeep = true;
        }
        // 3. [1 => 1
        int startNumber = 0;
        if(isKeep) {
            startNumber = input.charAt(1) - 48;
        } else {
            startNumber = input.charAt(1) + 1 - 48;
        }

        isKeep = false;
        if(input.endsWith("]")) {
            isKeep = true;
        }
        int endNumber = 0;
        int length = input.length();
        if(isKeep) {
            endNumber = input.charAt(length-2) - 48;
        } else {
            endNumber = input.charAt(length-2) - 1 - 48;
        }

        for (int i = startNumber; i <= endNumber ; i++) {
            output += i + ",";
        }
        System.out.println(output.substring(0, output.length()-1));
    }
}
