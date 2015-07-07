package ocpjp6.practice.study_guide.assessments.threads.more.join;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/9/14
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new CountNumber());
        Thread thread2 = new Thread(new CountAlphabet());
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println(Thread.currentThread().getName());
    }

}

class CountNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName()+" Number = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class CountAlphabet implements Runnable{
    private enum alphabets{
        a,b,c
    };
    @Override
    public void run() {
       for(alphabets a : alphabets.values()){
           System.out.println(Thread.currentThread().getName()+" alphabet = " + a);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}