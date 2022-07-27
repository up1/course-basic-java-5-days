public class MyPromotion {
    public static void main(String[] args) {
        int input = 1;
        process(input);
    }

    private static void process(int input) {
        if(input == 1) {
            Promotion1 p = new Promotion1();
            p.calculateDiscount();
        } else if(input == 2) {
            Promotion2 p = new Promotion2();
            p.calculateDiscount();
        }
    }
}

//class Promotion1 {
//    int calculateDiscount() {
//        return 100;
//    }
//}
//
//class Promotion2 {
//    int calculateDiscount() {
//        return 200;
//    }
//}


