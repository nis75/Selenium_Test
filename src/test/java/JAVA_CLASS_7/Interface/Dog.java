package JAVA_CLASS_7.Interface;

public class Dog implements Animal{
    @Override
    public void AnimalSound() {
        System.out.println("The dog says bow bow");
    }

    @Override
    public void Sleep() {
        System.out.println("Dog Sleep");

    }
}
