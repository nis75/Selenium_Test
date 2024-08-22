package JAVA_CLASS_8;

public class GenericTest <T>{
    T obj;
    public GenericTest(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return obj;
    }

}
