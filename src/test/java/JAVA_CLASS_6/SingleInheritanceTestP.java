package JAVA_CLASS_6;

public class SingleInheritanceTestP {
    //Inheritance Syntax
    //Modifier class className extends parent className
    //a. Left side class: child class/Sub class
    //b. Right side class: Parent class/Super class

    int number;

    public  void addition(int number1, int number2) {
        number = number1 + number2;
        System.out.println("The Sum Off The Given Numbers" + number);

    }
    public  void subtraction(int number1, int number2) {
        number = number1 - number2;
        System.out.println("The difference between The Given Numbers" + number);

    }
}
