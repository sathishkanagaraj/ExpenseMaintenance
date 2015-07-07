package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Redimix extends Concrete{
    Redimix(){
        System.out.println("r ");}

    public static void main(String[] args) {
        new Redimix();
    }
}
class Concrete extends Sand{
    Concrete(){
        System.out.println("c ");}
    private Concrete(String s){}
}

abstract class Sand {
    Sand(){
        System.out.println("s ");}
        }
