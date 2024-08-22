package JAVA_CLASS_2;

public class AssignmentOperatorTest {
    public static void main(String[] args) {

        int number1=66, number2=99;

        number1 += number2;
        System.out.println(number1);//165

        number2 -= number1;
        System.out.println(number2);//66

        number1 *= number2;
        System.out.println(number1);//6534

        number2 /= number1;
        System.out.println(number2);//1

        number1 %= 7;
        System.out.println(number1);//33

    }
}
