package ocpjp6.practice.study_guide.assessments.threads;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 7/8/14
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class DudesChat implements Runnable {
    static Dudes d;

    public static void main(String[] args) {
        new DudesChat().go();
    }
    void go(){
        d= new Dudes();
        new Thread(new DudesChat()).start();
        new Thread(new DudesChat()).start();
    }
    @Override
    public void run() {
       d.chat(Thread.currentThread().getId());
    }


}

class Dudes {
    static long flag = 0;

    void chat(long id){
        if(flag == 0){
           flag = id;
        }

        for (int x = 0; x < 3; x++) {
             if(flag == id){
                 System.out.println("yo");
             }  else{
                 System.out.println("dude");
             }

        }
    }

}
