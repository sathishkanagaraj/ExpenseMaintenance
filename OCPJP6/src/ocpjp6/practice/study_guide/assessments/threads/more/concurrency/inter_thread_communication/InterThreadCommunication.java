package ocpjp6.practice.study_guide.assessments.threads.more.concurrency.inter_thread_communication;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 8/9/14
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class InterThreadCommunication {
    public static void main(String[] args) {

        Queue<String>  stringQueue = new LinkedList<String>();
        Thread thread1 = new Thread(new Producer(stringQueue));
        Thread thread2 = new Thread(new Consumer(stringQueue));

        thread1.start();
        thread2.start();
    }
}

class Producer implements Runnable{

    private Queue<String> stringQueue = new LinkedList<String>();

    Producer(Queue<String> stringQueue) {
        this.stringQueue = stringQueue;
    }

    @Override
    public void run() {
       for (int i = 0; i<4; i++){
        synchronized (stringQueue){
            while (stringQueue.size() >=1){
                try {
                    System.out.println("String Queue is full");
                    stringQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        System.out.println("Producing : "+i);
           stringQueue.add(String.valueOf(i));
           stringQueue.notify();
       }
       }
    }
}

class Consumer implements Runnable{
    private Queue<String> stringQueue = new LinkedList<String>();

    Consumer(Queue<String> stringQueue) {
        this.stringQueue = stringQueue;
    }

    @Override
    public void run() {
        while(true) {
        synchronized (stringQueue){
            while(stringQueue.size() == 0){
                System.out.println("String Queue is empty");
                try {
                    stringQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                String poll = stringQueue.poll();
                System.out.println("Consuming : "+poll);
                stringQueue.notify();

        if(poll.equals(String.valueOf(3))) break;
        }
        }
    }
}
