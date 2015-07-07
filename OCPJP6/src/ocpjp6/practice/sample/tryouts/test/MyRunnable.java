package ocpjp6.practice.sample.tryouts.test;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 5/8/14
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for (int i = 0; i < 10; i++) {
            int x = i % 10;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"... "+x);

        }
        System.out.println(startTime-System.currentTimeMillis());
    }
}
class MyThread{
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        /*thread.start();*/
        thread.run();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
