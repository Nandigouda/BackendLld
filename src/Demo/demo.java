package Demo;
public class demo extends Main{
    int age;
    public static void main(String[] args) {
        System.out.println("Hello World");
        int x=10;
        int y=x;
        System.out.println(y);
        int xq=120;

        demo d=new demo();
        d.age=20;
        demo dd=d;
        dd.age=30;
        System.out.print(d.age);



    }
}

