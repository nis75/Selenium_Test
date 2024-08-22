package JAVA_CLASS_4;

public class switchTest {
    public static void main(String[] args) {
        int mark = 59;
        switch (mark) {
            case 80:
                System.out.println("A++");
                break;
                case 70:
                    System.out.println("B++");
                    break;
                    case 60:
                        System.out.println("C++");
                        break;
            default:
                System.out.println("All Pass");
        }
    }
}
