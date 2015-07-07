package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 7/8/14
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class Starter implements Runnable {
    @Override
    public void run() {
        go(Thread.currentThread().getId());
    }

    private void go(long id) {
        System.out.print(id);
    }

    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getId() + ",");
        //new Starter().run();
        //new Starter().start();
        //new Thread(new Starter());
        //new Thread(new Starter()).run();
        Thread thread = new Thread(new Starter());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        new Thread(new Starter()).start();
    }
}
