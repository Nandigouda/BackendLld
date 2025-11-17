package Polymorphism;

public class Client {
    public static void main(String[] args) {

        Animal aa = new Animal();

        Animal a = new Dog();
        aa.walk();
        a.walk();

        Dog d=new Dog();
        d.bark();



    }

}
