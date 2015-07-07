package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 7/8/14
 * Time: 7:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class WaitTest1 {

    public static synchronized void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread();
        t1.start();
        System.out.println("x");
        synchronized (t1){
            t1.wait(10000);
        }
        System.out.println("y");

    }
}
