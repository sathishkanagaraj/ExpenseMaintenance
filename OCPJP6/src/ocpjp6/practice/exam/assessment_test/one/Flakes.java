package ocpjp6.practice.exam.assessment_test.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */
class Cereal{}
public class Flakes extends Cereal {
    public static void main(String[] args) {
        /*compilation fails*/
       // List<Flakes> c0 = new List<Flakes>();
        List<Cereal> c1 = new ArrayList<Cereal>();
        /*compilation fails*/
        //List<Cereal> c2 = new ArrayList<Flakes>();
        /*compilation fails*/
        //List<Flakes> c3 = new ArrayList<Cereal>();
        /*compilation fails*/
        //List<Object> c4 = new ArrayList<Flakes>();
        /*compilation fails*/
        //ArrayList<Cereal> c5 = new ArrayList<Flakes>();

    }
}
