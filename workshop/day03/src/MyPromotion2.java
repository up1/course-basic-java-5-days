public class MyPromotion2 {
    public static void main(String[] args) {
        int input = 1;
        process(input);
    }

    private static void process(int order) {
        Promotion p1 = new Promotion1();
        int discount = p1.process(order);
    }
}

abstract class Promotion {
    abstract int calculateDiscount();
    abstract boolean checkPromotion(int order);
    int process(int order) {
        if(checkPromotion(order)) {
            return calculateDiscount();
        }
        return -1;
    }
}

class Promotion1 extends Promotion {

    @Override
    int calculateDiscount() {
        return 100;
    }

    @Override
    boolean checkPromotion(int order) {
        return true;
    }
}



