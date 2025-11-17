package Polymorphism;

public  class Dog extends Animal{
       public  void bark(){

           System.out.println("Dog barks");
       }

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }
}

