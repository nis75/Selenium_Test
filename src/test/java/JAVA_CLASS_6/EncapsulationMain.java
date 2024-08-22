package JAVA_CLASS_6;

public class EncapsulationMain {
    public static void main(String[] args) {
        EncapsulationRead read = new EncapsulationRead();
        System.out.println(read.getName());

        EncapsulationWrite write = new EncapsulationWrite();

        write.setName("Nazmun Mustakim Muaz");
        System.out.println("=========================");
        EncapsulationReadWrite readWrite = new EncapsulationReadWrite();
        readWrite.setName("Niamul Islam");
        //System.out.println(readWrite.getName());
    }
}
