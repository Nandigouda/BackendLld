package inheritance;

public class Student extends User{
    String psp;


    public Student(){
        //calls User constructor
        super(); //refers to parent Constructor
        System.out.println("Student Constructor");
    }
    public Student(int age){
        this();
    }
    public Student(int a, int aa){
        super();


    }
@Override
public void walk(){
    System.out.println("Overriding Parent method");
}
    public void walk(int e) {
        System.out.println("nikh");


    }

}
