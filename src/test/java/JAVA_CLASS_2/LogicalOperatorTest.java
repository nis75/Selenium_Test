package JAVA_CLASS_2;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int number1=66, number2=99;
        System.out.println(number1 != number2);//T
        System.out.println(number1 == number2);//F
        System.out.println(number1 > number2);//F
        System.out.println(number1 < number2);//T
        System.out.println(number1 >= number2);//F
        System.out.println(number1 <= number2);//T
        System.out.println((number1 == number2) && (number1 > number2));//F
        System.out.println((number1 == number2) || (number1 < number2));//T
    }
}
