package JAVA_CLASS_3;

public class Person {
    String name;
    String gender;
    float height;
public Person(){

}
public Person(String name,String gender,float height){
    this.name=name;
    this.gender=gender;
    this.height=height;

}
public void canSpeak(){
    System.out.println(name + " is speaking");
}
public void canWalk(){
    System.out.println("All are equal " + gender);
}


}
