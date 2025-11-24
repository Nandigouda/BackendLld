package MultiThreading;

public class PrintNumber implements Runnable {
int x;
    public PrintNumber(int x) {

        this.x = x;
    }

    @Override
    public void run(){
        System.out.println("PrintNUmber: "+ "-> " + x +" "+ Thread.currentThread().getName());

    }


}
