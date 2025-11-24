package MultiThreading;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Nikhil Nandigoud in main-> " + Thread.currentThread().getName());

        // Thread th=new Thread(new HelloWorldPrinter());
//    HelloWorldPrinter task=new HelloWorldPrinter();
//    Thread th=new Thread(task);
//        th.start(); //is calling runnable.run


//        PrintNumber pn=new PrintNumber();
//        Thread th1=new Thread(pn);
//        Thread er=new Thread();
//        th1.start();

//As soon as the task is assigned the thread strts to execute without delay or queue
//        for (int i = 0; i < 10000; i++) {
//            PrintNumber task = new PrintNumber(i);
////            Thread th=new Thread(task);
////            th.start();
//
//        }
//

        //ThreadPool - Fixed thread pool and Cached therad pool

        //     Thread t = new Thread(() -> {
//            System.out.println("Running task");
//        });
//        t.start();

        // fixedThreadPool
//        Thread t = new Thread();
     ExecutorService es= Executors.newFixedThreadPool(10);   //upcasting

//We create a thread pool with 4 threads
//✔ It is created by Executors class
//✔ The object created is a ThreadPoolExecutor
//✔ It is stored in a variable of type es
//✔ We use ExecutorService methods to run tasks

        for (int i = 0; i <10000; i++) {
            PrintNumber task = new PrintNumber(i);
//            Thread th=new Thread(task);
//            th.start();

es.execute(task);
if(i==2000){
    System.out.println("Debug");
}
        }

        //Cached threadPool
        // Cached Pool → auto-growing, flexible size
        //time wise it is more time compared to fixedThreadPool
        ExecutorService es1=Executors.newCachedThreadPool();
//        No need to give a number because:
//        It creates a new thread when no free thread is available
//        It reuses old threads if they are free
//        Idle threads are removed after 60 seconds
//        It can grow to many threads if required
//        So cached pool is:
//        flexible
//        expandable
//        suitable for short, bursty tasks

        for(int i=1;i<1000;i++){

            PrintNumber pm=new PrintNumber(i);
            es1.execute(pm);

        if (i==100){
            System.out.println("Debug");
        }}



//callable
//        SquareNumber sqTask=new SquareNumber(3);
//        Thread thread=new Thread(sqTask);

        SquareNumber sqTask = new SquareNumber(3);

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> result = executor.submit(sqTask);
          //System.out.println(result.get());
        Integer resInteger=result.get(); //waiting
        System.out.println(resInteger);



        //executor.shutdown();

    }}