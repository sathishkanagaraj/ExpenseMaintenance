package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Jail {
    private int x = 4;

    public static void main(String[] args) {
        // access modifiers are not allowed here
        /*protected int x = 6;*/
    }

    class Cell{
        void slam(){
            System.out.println("throws away key "+ x);
        }
    }
}
