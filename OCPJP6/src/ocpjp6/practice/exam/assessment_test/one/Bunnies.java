package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bunnies {

    static int count = 0;
    Bunnies(){
        while (count < 10) new Bunnies(++count);
    }
    Bunnies(int x){
        super();
    }

    public static void main(String[] args) {
        new Bunnies();
        new Bunnies(count);
        System.out.println(count++);
    }
}
