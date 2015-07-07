package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 6/8/14
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread myThread =  new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; ++i) {
            System.out.print(i+"..");

        }
    }
}
