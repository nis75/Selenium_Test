package JAVA_CLASS_2;

public class VariableTest {
    long studentId;
    static String departmentName="CSE";

    public void printDepartmentName(){
        String studentName="Rahim";
        System.out.println("Student Name :"+ studentName+" Depart Name:"+departmentName+" Student Id:"+studentId);
    }

    public void printMarks(){
        int mark=80;
        System.out.println("Mark :"+ mark);
    }

    public static void main(String[] args) {
        System.out.println(VariableTest.departmentName);

        VariableTest test = new VariableTest();
        test.studentId=20240804;
        test.printMarks();;
        test.printDepartmentName();

        VariableTest test2 = new VariableTest();
        test2.studentId=20240805;
        test2.printMarks();;
        test2.printDepartmentName();
    }
}
