package JAVA_CLASS_8;

import JAVA_CLASS_3.Pen;

public class GenericMain {
    public static void main(String[] args) {
        StringTest sTest = new StringTest("Naba");
        System.out.println(sTest.getStr());

        IntegerTest iTest = new IntegerTest(88);
        System.out.println(iTest.getInteger());

        LongTest lTest = new LongTest(88L);
        System.out.println(lTest.getLong());

        DoubleTest dTest = new DoubleTest(88.88);
        System.out.println(dTest.getDouble());

        System.out.println("====generic without restriction==========");

        GenericTest<String> strTest = new GenericTest<>("Nihan");
        System.out.println(strTest.getObj());
        GenericTest<Integer> intTest = new GenericTest<>(999);
        System.out.println(intTest.getObj());
        GenericTest<Long> lngTest = new GenericTest<>(888L);
        System.out.println(lngTest.getObj());
        GenericTest<Double> dblTest = new GenericTest<>(999D);
        System.out.println(dblTest.getObj());

        GenericTest<Pen> penGenericTest=new GenericTest<>(new Pen());
        System.out.println(penGenericTest.getObj());

        System.out.println("====generic with restriction==========");

        NumberTest<Integer> nTest = new NumberTest<>(88);
        System.out.println(nTest.getObj());
        NumberTest<Float> flotTest = new NumberTest<>(99f);
        System.out.println(flotTest.getObj());
        NumberTest<Long> longTest = new NumberTest<>(77l);
        System.out.println(longTest.getObj());
        NumberTest<Double> doubleTest = new NumberTest<>(66d);
        System.out.println(doubleTest.getObj());



    }
}
