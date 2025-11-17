package Constructor;

import java.sql.SQLOutput;

public class Student {
    public String name;
    private int age;
    protected int age1;


    public Student() {

    }

    public Student(Student obj) {

        this.age = obj.age;
        this.name = obj.name;
        this.age1 = obj.age1;

    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }


}