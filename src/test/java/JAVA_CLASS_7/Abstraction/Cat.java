package JAVA_CLASS_7.Abstraction;

public class Cat extends Animal {
public int age;

    @Override
    public void AnimalSound() {
        System.out.println("The cat sounds moe moe");
    }
    public void eat(){
        System.out.println("Cat eat milk & fish");
    }
}
