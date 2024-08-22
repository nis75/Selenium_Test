package JAVA_CLASS_6;

public class SingleInheritanceTestMain {
    public static void main(String[] args) {
        SingleInheritanceTestChild child = new SingleInheritanceTestChild();
        child.number=500;
        child.addition(320,520);
        child.subtraction(720,520);
        child.multiply(300,20);
        System.out.println("============================");
        AnyOne one = new AnyOne();
        one.number=55;
        one.addition(65,75);
        one.subtraction(333,222);
        one.multiply(777,33);
    }
}
