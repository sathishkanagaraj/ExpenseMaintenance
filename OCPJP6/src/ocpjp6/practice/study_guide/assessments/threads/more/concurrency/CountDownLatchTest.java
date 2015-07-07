package ocpjp6.practice.study_guide.assessments.threads.more.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/9/14
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(5);
        Thread thread1 = new Thread(new Service("CacheService",1000,countDownLatch));
        Thread thread2 = new Thread(new Service("AlertService",1000,countDownLatch));
        Thread thread3 = new Thread(new Service("ValidationService",1000,countDownLatch));
        Thread thread4 = new Thread(new Service("OtherService",1000,countDownLatch));
        Thread thread5 = new Thread(new Service("AnotherService",1000,countDownLatch));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            countDownLatch.await();
            System.out.println("All the services are up and running.....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Service implements Runnable{

    private String name;
    private int threadSleepTime;
    private CountDownLatch countDownLatch;

    Service(String name, int threadSleepTime, CountDownLatch countDownLatch) {
        this.name = name;
        this.threadSleepTime = threadSleepTime;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(threadSleepTime);
        } catch (InterruptedException e) {
            Logger.getLogger(Service.class.getSimpleName()).log(Level.SEVERE,"Oops Interrupted",e);
        }
        System.out.println(name+" is up & count is : "+countDownLatch.getCount());
        countDownLatch.countDown();
    }
}
