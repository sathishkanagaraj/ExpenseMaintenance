package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 6:16 PM
 * To change this template use File | Settings | File Templates.
 */
class Feline {}
public class BarnCat2 extends Feline {

    public static void main(String[] args) {
        Feline f = new Feline();
        BarnCat2 b = new BarnCat2();

        if(b instanceof Feline){
            System.out.println("3");
        }
    }

}
