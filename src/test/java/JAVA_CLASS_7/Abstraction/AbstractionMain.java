package JAVA_CLASS_7.Abstraction;

public class AbstractionMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        cat.AnimalSound();
        cat.eat();
        cat.Sleep();
        cat.age=22;
        cat.legNumber=4;

        Animal cat2 = new Cat();
        cat2.legNumber=4;
        cat2.Sleep();
        cat2.AnimalSound();

    }
}
