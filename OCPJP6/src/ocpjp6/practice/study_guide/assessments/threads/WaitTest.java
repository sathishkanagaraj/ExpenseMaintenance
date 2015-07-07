package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 6/8/14
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class WaitTest {
    public static void main(String[] args) {
        System.out.println("1");
        synchronized (args){
            System.out.println("2");
            try {
                args.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3");
        }
    }
}
