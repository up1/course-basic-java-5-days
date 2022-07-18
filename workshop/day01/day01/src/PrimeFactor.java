public class PrimeFactor {

//    8
//    8/2 = 4  => 2
//    4/2 = 2  => 2
//    2/2 = 1  => 2

    public String print(int input) {
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
