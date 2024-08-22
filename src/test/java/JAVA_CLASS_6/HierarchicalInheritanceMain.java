package JAVA_CLASS_6;

public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
         HierarchicalInheritanceChild1 child1 = new HierarchicalInheritanceChild1();
         child1.multiply(22,22);
         child1.addition(999,555);
         child1.subtraction(777,333);
        System.out.println("===========================");
        HierarchicalInheritanceChild2 child2 = new HierarchicalInheritanceChild2();
        child2.divide(555,5);
        child2.addition(777,555);
        child2.subtraction(999,444);
        System.out.println("===========================");
        HierarchicalInheritanceParent parent = new HierarchicalInheritanceParent();
        parent.addition(99,99);
        parent.subtraction(77,33);

    }
}
