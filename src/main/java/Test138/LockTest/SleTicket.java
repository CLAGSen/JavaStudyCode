package Test138.LockTest;

import java.awt.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SleTicket implements Runnable{

   static int ticket=100;
    private static final ReentrantLock LOCK = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                LOCK.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName() + "售票,票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            } finally {
                LOCK.unlock();

            }

        }


    }
}
