package ProctectedAccess;

import Constructor.Student;

public class Client {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="nikhil";
        Student s1=s; //Shallow copy

        s1.name="nik";
        System.out.println(s.name);
    }



}
