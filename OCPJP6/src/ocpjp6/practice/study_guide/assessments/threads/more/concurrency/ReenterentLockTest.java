package ocpjp6.practice.study_guide.assessments.threads.more.concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/9/14
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReenterentLockTest {

    public static void main(String[] args) {
        final ReenterentLockSample lockSample = new ReenterentLockSample();
            Thread thread = new Thread(){
                public void run(){
                   while(lockSample.getCount()<6){
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   }
            };

        Thread thread1 = new Thread(){
            public void run(){
                while(lockSample.getCount()<6){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                while(lockSample.getCount()<6){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class ReenterentLockSample {
    private final ReentrantLock lock = new ReentrantLock();
    private int count;

    public int getCount(){
         lock.lock();
        try{
        System.out.println(Thread.currentThread().getName() + " gets : "+count);
        return count++;
        }finally{
            lock.unlock();
        }
    }
}
