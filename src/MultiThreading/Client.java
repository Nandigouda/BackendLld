package MultiThreading;

public class Client {
    public static void main(String[] args) {
        System.out.println("Nikhil Nandigoud in main-> " + Thread.currentThread().getName());

       // Thread th=new Thread(new HelloWorldPrinter());
    HelloWorldPrinter task=new HelloWorldPrinter();
    Thread th=new Thread(task);
        th.start(); //is calling runnable.run


        PrintNumber pn=new PrintNumber();
        Thread th1=new Thread(pn);
        Thread er=new Thread();
        th1.start();

    }
}
// HWPrinter
// Printer
// PrintName
// CallImageProcessing