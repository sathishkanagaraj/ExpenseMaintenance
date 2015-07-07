package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stroll {
    //  out of a,b,c,d which set will execute all main thread before t1.
    public static void main(String[] args) {
        Thread t1 = new Thread(new Mosey());
        //a
        t1.setPriority(1);
        new Mosey().run();
        t1.start();
        //b
        t1.setPriority(9);
        new Mosey().run();
        t1.start();
        //c
        t1.setPriority(1);
        t1.start();
        new Mosey().run();

        // this alone will execute the  t1 thread before main thread because
        // t1 has high priority and started before main thread(new Mosey.run())
        //d
        t1.setPriority(8);
        t1.start();
        new Mosey().run();
    }
}

class Mosey implements Runnable{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println(Thread.currentThread().getName() + "-" + i + "");
        }
    }
}
