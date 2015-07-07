package ocpjp6.practice.study_guide.assessments.threads.more.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/9/14
 * Time: 5:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        final  CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new Runnable() {
            @Override
            public void run() {
                System.out.println("All Parties ran successfully");
            }
        });
      Thread thread1 = new Thread(new CyclicBarrierSample(cyclicBarrier));
      Thread thread2 = new Thread(new CyclicBarrierSample(cyclicBarrier));
      Thread thread3 = new Thread(new CyclicBarrierSample(cyclicBarrier));
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class CyclicBarrierSample implements Runnable{

    private CyclicBarrier cyclicBarrier;

    CyclicBarrierSample(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" -Thread are waiting ");
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName()+" -Thread crossed the barrier");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
