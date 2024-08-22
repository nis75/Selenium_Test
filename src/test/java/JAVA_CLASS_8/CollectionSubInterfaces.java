package JAVA_CLASS_8;

import java.util.*;

public class CollectionSubInterfaces {
    public static void main(String[] args) {

        System.out.println("==========List===========");
        List<Integer> integers = new ArrayList<>();
        integers.add(99);
        integers.add(123);
        integers.add(456);


        integers.add(2,555);

        //System.out.println(integers);
        integers.remove(0);


         List<Integer> integers1 = Arrays.asList(11,22,33,44);
        integers.addAll(0,integers1);

        integers.removeAll(integers1);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        //Set
        System.out.println("==========SET===========");

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(98);
        integerSet.add(45);
        integerSet.add(50);

        integerSet.add(50);
        integerSet.add(502);

        integerSet.remove(50);

        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(65);
        integerSet1.add(85);

        integerSet.addAll(integerSet1);

        for (Integer integer : integerSet) {
            System.out.println(integer);
        }
        System.out.println("==========MAP===========");

        Map<String,Object> objectMap = new HashMap<>();
        objectMap.put("name","Muaz");
        objectMap.put("age",23);
        objectMap.put("color","blue");
        objectMap.put("height",5.9);
        System.out.println(objectMap.toString());
        System.out.println(objectMap.get("name"));


    }
}
