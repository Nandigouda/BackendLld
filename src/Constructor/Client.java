package Constructor;

public class Client{


    public static void main(String[] args) {
Student s=new Student();
Student scopy=new Student(s);

s.name="Nikhil";
s.age1=34;
        s.setAge(12);
      System.out.println(s.getAge());
      scopy.setAge(33);
        System.out.println(scopy.getAge());
       System.out.println("Debug");
    }
}
