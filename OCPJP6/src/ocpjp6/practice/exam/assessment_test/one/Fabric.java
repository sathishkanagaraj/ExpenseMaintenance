package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fabric extends Thread {
    public static void main(String[] args) {

        Thread t = new Thread(new Fabric());
        Thread t2 = new Thread(new Fabric());

        t.start();
        t2.start();
    }

    // compilation error , cannot override static run()
   /* public static void run(){

        for (int i = 0; i < 2; i++) {
            System.out.println(MyRunnable.currentThread().getName());
        }
    }*/
}
