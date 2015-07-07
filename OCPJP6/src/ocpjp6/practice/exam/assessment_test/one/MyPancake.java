package ocpjp6.practice.exam.assessment_test.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 31/7/14
 * Time: 11:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyPancake implements Pancake{
    public static void main(String[] args) {
        List<String> x = new ArrayList<String>();
        x.add("3"); x.add("7"); x.add("5");

        List<String> y = new MyPancake().doStuff(x);
        y.add("1");
        System.out.println(x);
    }

    @Override
    public List<String> doStuff(List<String> z) {
        z.add("9");
        return z;
    }
}

interface Pancake{
    List<String> doStuff(List<String> s);
}
