package JAVA_CLASS_4;

public class methodMainTest {

    public static void main(String[] args) {
      methodTest.printName();
      methodTest test = new methodTest();
        System.out.println("Non Void Method " + test.divide());
        test.printNumber();
        System.out.println("Non Void Method2 " + test.add(55,33));
    }
}
