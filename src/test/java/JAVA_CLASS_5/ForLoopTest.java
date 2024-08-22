package JAVA_CLASS_5;

public class ForLoopTest {

    public static void main(String[] args) {

        //Do While
        //System.out.println("==================================");
        //int j=10;
        //do {
       //     System.out.println(j);
       // } while (j>= 6);
        System.out.println("==================================");
        String names[] = {"Nazmun","Nusaiba","Naba","Nihan"};

        for(String name : names){
        if (name.equals("Naba")) break;
            System.out.println(name);

        }
        System.out.println("==================================");
        for (int i = 0; i < 10.; i++) {
            if (i <= 10){
                System.out.println(i);
                continue;
            }
        }
        System.out.println("==================================");
    }
}
