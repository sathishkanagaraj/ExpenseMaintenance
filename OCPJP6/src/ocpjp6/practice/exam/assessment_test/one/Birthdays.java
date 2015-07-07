package ocpjp6.practice.exam.assessment_test.one;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Birthdays {
               // argument should be 'java Birthdays Draumur'
    public static void main(String[] args) {
        Map<Friends, String> hm = new HashMap<Friends, String>();
        hm.put(new Friends("Charis"),"Summer 2009");
        hm.put(new Friends("Draumur"),"Spring 2002");

        Friends f = new Friends(args[0]);
        System.out.println(hm.get(f));

    }

}
class Friends {
    String name;
    Friends(String n){name = n;}
}
