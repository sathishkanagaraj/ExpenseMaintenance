package ocpjp6.practice.study_guide.examples.collections.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/8/14
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTreeSet {

    static String [] strArray;
    static public  void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.addAll(Arrays.asList("sathish","karthik","gopi","deepak","prakash","divakar","anand"));

        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>();
        integerTreeSet.addAll(Arrays.asList(1,3,5,7,2,9,3,7,4,6,1,8));
        NavigableSet<Integer> integerNavigableSet = integerTreeSet.subSet(4, false, 20, true);
        System.out.println("integerTreeSet = " + integerTreeSet);
        System.out.println("integerNavigableSet = " + integerNavigableSet);
        integerTreeSet.add(10);
        System.out.println("integerTreeSet = " + integerTreeSet);
        System.out.println("integerNavigableSet = " + integerNavigableSet);
        System.out.println("integerNavigableSet-decending = " + integerNavigableSet.descendingSet());
        System.out.println("integerNavigableSet-headset= " + integerNavigableSet.headSet(9,true));
        System.out.println("integerNavigableSet-tailset= " + integerNavigableSet.tailSet(9,true));
        System.out.println("integerNavigableSet-pollfirat= " + integerNavigableSet.pollFirst());
        System.out.println("integerNavigableSet-polllast= " + integerNavigableSet.pollLast());
        System.out.println("integerNavigableSet-size after poll= " + integerNavigableSet.size());
        System.out.println("integerNavigableSet- after poll= " + integerNavigableSet);
        /*System.out.println(" integer ceiling" + integerTreeSet.ceiling(5));
        System.out.println(" integer higher" + integerTreeSet.higher(5));
        System.out.println(" integer floor" + integerTreeSet.floor(5));
        System.out.println(" integer lower" + integerTreeSet.lower(5));*/
        String[] strAry = new String[0];
        System.out.println("strArr = " + args.length);
        System.out.println("strArr = " + strAry.length);

    }

    public static void main(String args) {

    }
}
