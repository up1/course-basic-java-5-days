public class DemoPoly {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        sayWithAnimal(cat);
        sayWithAnimal(dog);
    }

    private static void sayWithAnimal(Animal animal) {
        animal.say();
    }
}

abstract class Animal {
    void say() {
        System.out.println("Animal say");
    }
}
class Cat extends Animal {
    @Override
    void say() {
        System.out.println("Cat say");
    }
}

class Dog extends Animal {
    @Override
    void say() {
        System.out.println("Dog say");
    }
}
