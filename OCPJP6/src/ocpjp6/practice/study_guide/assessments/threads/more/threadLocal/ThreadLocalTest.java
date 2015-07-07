package ocpjp6.practice.study_guide.assessments.threads.more.threadLocal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 8/9/14
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLocalTest {

    private static int count;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new CounterTask());
        Thread thread2 = new Thread(new CounterTask());
        Thread thread3 = new Thread(new CounterTask());
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static String threadSafeFormat(Date date0){
        //DateFormat dateFormat = ThreadLocalFormatter.getDateFormatter();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date0);
    }

    public static int countNumber(){
        return ThreadLocalCounter.getCount();
    }
}

class ThreadLocalCounter {
    private static int count;
    private static final ThreadLocal<Integer> INTEGER_THREAD_LOCAL = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return count++;
        }
    };

    public static Integer getCount(){
       return INTEGER_THREAD_LOCAL.get();
    }
}

class ThreadLocalFormatter {

    private static final ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println("Creating SimpleDateFormat for thread : "+ Thread.currentThread().getName());
            return new SimpleDateFormat("dd/MM/yyyy");
        }
    };

    public static DateFormat getDateFormatter(){
     
        return simpleDateFormatThreadLocal.get();
    }
}
class Task implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Current Thread :" + Thread.currentThread().getName() + "  - Formatted Date :" + ThreadLocalTest.threadSafeFormat(new Date()));
        }
    }
}

class CounterTask implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Current Thread :" + Thread.currentThread().getName() + "  - Count:" + ThreadLocalTest.countNumber());
        }
    }
}
