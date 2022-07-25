package oop;

final class Constant {
    public static final String PASSWORD = "1234";
}

class Child1 extends Base {
}

public class Base {
    public static void main(String[] args) {
        Base base = new Base();
        Child1 child1 = new Child1();

        System.out.println( child1 instanceof Object );
        System.out.println( base instanceof Object );
    }

}

class Child2 extends Base {
}

abstract class Xyz {
    abstract void call1();
    void call2() {

    }
}
