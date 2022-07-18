public class Lopping {
    public static void main(String[] args) {
        String[] names = {"A", "B", "C"};
        int length = names.length;

        int i = 0;
        do {
            System.out.println(names[i]);
            i++;
        }while (i < length);

    }

    private static void loopWhile(String[] names) {
        int length = names.length;

        int i = 0;
        while (i<length) {
            System.out.println(names[i]);
            i++;
        }
    }

    private static void demoFor(String[] names) {
        int length = names.length;

        for(int i = 0; i<length; i++) {
            if(i >= 1) {
                continue;
            }
            System.out.println(names[i]);
        }
        for (String name : names) {
//            System.out.println(name);
        }
    }
}
