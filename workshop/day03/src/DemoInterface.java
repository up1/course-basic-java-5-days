import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        IAnimal animal = new CatImpl();
        List<String> names = new ArrayList<>();
    }
}
interface IAnimalWithSleep extends IAnimal {
    void sleep();
}

interface IAnimal {
    void say();
    void eat();
}

abstract class IAnimal2 {
    abstract void say();
    abstract void eat();
}

interface Sleepable {
    void sleep();
}

class CatImpl implements IAnimal, Sleepable {

    @Override
    public void say() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
