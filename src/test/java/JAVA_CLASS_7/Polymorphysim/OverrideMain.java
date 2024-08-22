package JAVA_CLASS_7.Polymorphysim;

public class OverrideMain {

    public static void main(String[] args) {
        System.out.println("=====Dog====");
        Dog dog = new Dog();
        dog.animalSound();

        System.out.println("=====Cat====");
        Cat cat = new Cat();
        cat.animalSound();

        System.out.println("=====CAT2====");
        Animal cat2 = new Cat();
        cat2.test();
        cat2.animalSound();

        System.out.println("=====Animal====");
        Animal animal = new Animal();
        animal.animalSound();
    }
}
