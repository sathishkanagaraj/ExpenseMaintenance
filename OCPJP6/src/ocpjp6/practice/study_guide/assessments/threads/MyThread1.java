package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 7/8/14
 * Time: 8:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyThread1 extends Thread {

    MyThread1(){
        System.out.println("MyThread1 - constructor executed");
    }

    public void run(){
        System.out.println("MyThread1 - run");
    }

    public void run(String s){
        System.out.println("s = " + s);
    }

}

class TestMyThread1 {

    public static void main(String[] args) {
       Thread t1 = new MyThread1(){

           @Override
           public void run() {
               System.out.println("Main - run");
           }
       };
        t1.start();
    }
}
