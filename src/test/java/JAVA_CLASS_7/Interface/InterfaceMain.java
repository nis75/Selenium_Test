package JAVA_CLASS_7.Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.AnimalSound();
        dog.Sleep();

        Animal animal = new Dog();
        animal.AnimalSound();
        animal.Sleep();
    }
}
