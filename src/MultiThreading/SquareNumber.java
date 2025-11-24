package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class SquareNumber implements Callable<Integer> {

    int x;


   public SquareNumber(int x){

       this.x=x;
   }
    @Override
   public Integer call() throws Exception{

        return x*x;

    }
}
