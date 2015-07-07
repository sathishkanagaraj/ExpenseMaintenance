package ocpjp6.practice.study_guide.assessments.threads.more.concurrency.inter_thread_communication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/9/14
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlockingQueueTest {

    public static void main(String[] args) {

        BlockingQueue<String> stringBlockingQueue = new LinkedBlockingQueue<String>();
        Thread producerThread = new Thread(new Producer1(stringBlockingQueue));
        Thread consumerThread = new Thread(new Consumer1(stringBlockingQueue));

        producerThread.start();
        consumerThread.start();

    }
}

class Producer1 implements Runnable{

    private BlockingQueue<String> stringBlockingQueue;

    Producer1(BlockingQueue<String> stringBlockingQueue) {
        this.stringBlockingQueue = stringBlockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            try {
                System.out.println("Produced : "+i);
                stringBlockingQueue.put(String.valueOf(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer1 implements Runnable{
    private BlockingQueue<String> stringBlockingQueue;

    Consumer1(BlockingQueue<String> stringBlockingQueue) {
        this.stringBlockingQueue = stringBlockingQueue;
    }

    @Override
    public void run() {
        while(stringBlockingQueue.size()<=0){
        try {
            System.out.println("Consumed : " +stringBlockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}