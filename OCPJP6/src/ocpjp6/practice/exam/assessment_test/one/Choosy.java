package ocpjp6.practice.exam.assessment_test.one;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Choosy {

    public static void main(String[] args) {
        String result = "";
        int x = 7, y = 8;
        if(x == 3) {result += "1";}
        else if(x > 9) {result += "2";}
        else if(x < 9) {result += "3";}
        else if(x == 7) {result += "4";}
        else {result += "5";}
        System.out.println(result);
    }
}
