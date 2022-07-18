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
        result = p.print(9);
        System.out.println(result);
        result = p.print(6);
        System.out.println(result);
    }
//    8
//    8/2 = 4  => 2
//    4/2 = 2  => 2
//    2/2 = 1  => 2

    private String print(int input) {
        String result = "";
        for (int primeNumber = 2; primeNumber <= 3 ; primeNumber++) {
                while (input % primeNumber == 0) {
                    result = result + "" + primeNumber;
                    input = input / primeNumber;
                }
        }
        return result;
    }
}
