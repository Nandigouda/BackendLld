package AdderSubstractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Subatractor implements Callable<Void> {
Value val;

ReentrantLock lock;



    public Subatractor(Value val, ReentrantLock lock) {
        this.val = val;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0;i<100000;i++){
lock.lock();
            val.v-=i;
            System.out.println("Value is decremented to " + val.v);
            lock.unlock();
        }
        return null;
    }
}
