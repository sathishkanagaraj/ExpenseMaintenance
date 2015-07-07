package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Format {

    public static void main(String[] args) {
        boolean b = false;
        int i = 7;
        double d = 1.23;
        float f = 4.56f;

        System.out.printf(" %b",b);
        // wrong conversion
        System.out.printf(" %i",i);

        // wrong conversion
        System.out.format(" %d",d);
        System.out.format(" %d",i);
        System.out.printf(" %f",f);
    }
}
