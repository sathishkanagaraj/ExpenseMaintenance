package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 6/8/14
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Logger {
    public StringBuilder builder = new StringBuilder();
    public void log(String message){
        builder.append(Thread.currentThread().getName());
        builder.append(" : ");
        builder.append("a");
        builder.append("b");
        builder.append("c");
        builder.append("d");
        builder.append("e");
        builder.append("f");
        builder.append("--");
        builder.append(message);
        builder.append("\n");
    }

    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public String getContents(){
        return builder.toString();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        Logger logger = new Logger();
        logger.log("hi");
        System.out.println(logger.getContents());
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        Thread thread4 = new Thread(myRunnable);
        Thread thread5 = new Thread(myRunnable);
        /*Thread thread6 = new Thread(myRunnable);
        Thread thread7 = new Thread(myRunnable);
        Thread thread8 = new Thread(myRunnable);
        Thread thread9 = new Thread(myRunnable);
        Thread thread10 = new Thread(myRunnable);
        Thread thread11= new Thread(myRunnable);
        Thread thread12= new Thread(myRunnable);
        Thread thread13= new Thread(myRunnable);
        Thread thread14= new Thread(myRunnable);
        Thread thread15= new Thread(myRunnable);
        Thread thread16= new Thread(myRunnable);
        Thread thread17= new Thread(myRunnable);
        Thread thread18= new Thread(myRunnable);
        Thread thread19= new Thread(myRunnable);
        Thread thread20= new Thread(myRunnable);*/
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        /*thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();
        thread15.start();
        thread16.start();
        thread17.start();
        thread18.start();
        thread19.start();
        thread20.start();*/
    }
}
