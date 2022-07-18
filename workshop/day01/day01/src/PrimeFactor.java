public class PrimeFactor {
    public static void main(String[] args) {
        PrimeFactor p = new PrimeFactor();
        String result = p.print(2);
        System.out.println(result);
        result = p.print(4);
        System.out.println(result);
        result = p.print(8);
        System.out.println(result);
        result = p.print(16);
        System.out.println(result);
    }
//    8
//    8/2 = 4  => 2
//    4/2 = 2  => 2
//    2/2 = 1  => 2

    private String print(int input) {
        String result = "";
        while (input%2 == 0) {
            result = result + "2";
            input = input/2;
        }
        return result;
    }
}
