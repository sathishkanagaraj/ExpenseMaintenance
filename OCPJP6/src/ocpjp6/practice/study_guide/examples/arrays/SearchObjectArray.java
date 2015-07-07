package ocpjp6.practice.study_guide.examples.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/8/14
 * Time: 2:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchObjectArray {
    public static void main(String[] args) {
        String[] sa = new String[]{"one","two","three","four"};
        Arrays.sort(sa);
        for (String s : sa) {
            System.out.println("s = " + s);
        }
        System.out.println("\n one = "+ Arrays.binarySearch(sa,"one")+"\n");

        ReSortComparator reSortComparator = new ReSortComparator();
        Arrays.sort(sa,reSortComparator);
        for (String s : sa) {
            System.out.println("s = " + s);
        }
        System.out.println("\n one = "+ Arrays.binarySearch(sa,"one",reSortComparator)+"\n");
    }
}

class ReSortComparator implements Comparator<String>{

    @Override
    public int compare(String object1, String object2) {
        return object2.compareTo(object1);
    }
}
