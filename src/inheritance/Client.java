package inheritance;

import org.w3c.dom.ls.LSOutput;

public  class Client {

    public static void main(String[] args) {


        Student s=new Student(12,1);

        System.out.println("Debug");

User a=new User();
User a2=new Student();

a2.walk();

        //overriding Method
       s.walk();
        //overloading Methods
        s.walk(2);

        a.walk();


    }



}
