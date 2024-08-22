package JAVA_CLASS_6;

public class MultiLevelInheritanceMain {
    public static void main(String[] args) {
        MultiLevelInheritanceRoot root = new MultiLevelInheritanceRoot();
        root.addition(555,666);
        root.addition(444,555);
        root.subtraction(999,555);
        System.out.println("=====================================");
        MultiLevelInheritanceParent parent = new MultiLevelInheritanceParent();
        parent.addition(33,44);
        parent.addition(22,33);
        parent.subtraction(99,88);
        System.out.println("=====================================");
        MultiLevelInheritanceChild child = new MultiLevelInheritanceChild();
        child.addition(33,44);
        child.divide(999,3);
        child.subtraction(99,88);

    }
}
