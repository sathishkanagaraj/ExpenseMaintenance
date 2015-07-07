package ocpjp6.practice.study_guide.examples.oops.polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 23/8/14
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestOverride {

    public static void main(String[] args) {
        Kanagaraj kanagaraj = new Karthik();
        System.out.println("kanagaraj = " + kanagaraj.getName());
        System.out.println("kanagaraj = " + kanagaraj.getKanagaraj());
    }
}
