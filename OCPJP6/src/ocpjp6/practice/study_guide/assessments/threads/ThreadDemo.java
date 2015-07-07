package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 7/8/14
 * Time: 8:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadDemo {

   static synchronized void a(String s){
        actBusy(s);
        actBusyAgain(s);
    }

   static synchronized void b(String s){
        actBusy(s);
        actBusyAgain(s);
    }

    static void actBusyAgain(String s) {
        try {
            System.out.println(s+"--ThreadDemo.actBusyAgain--"+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     static void actBusy(String s) {
        try {
            System.out.println(s+"--ThreadDemo.actBusy--"+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final ThreadDemo x = new ThreadDemo();
        final ThreadDemo y = new ThreadDemo();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int i = (int) (Math.random() * 4);
                switch (i){
                    case 0: x.a("x.a");
                        //System.out.println("x.a in"+Thread.currentThread().getName() );
                        break;
                    case 1: x.b("x.b");
                        //System.out.println("x.b in"+Thread.currentThread().getName() );
                        break;
                    case 3: y.a("y.a");
                        //System.out.println("y.a in"+Thread.currentThread().getName() );
                        break;
                    case 4: y.b("y.b");
                        //System.out.println("y.b in"+Thread.currentThread().getName() );
                        break;
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
