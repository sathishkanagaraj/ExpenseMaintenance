package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 6/8/14
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        TestRunnable runnable = new TestRunnable();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }

    public void printAll(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TestRunnable implements Runnable{
    Test test = new Test();
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        test.printAll(new String[]{"sasdasd", "hjghjghj", "vbnvbn"});
    }

}
