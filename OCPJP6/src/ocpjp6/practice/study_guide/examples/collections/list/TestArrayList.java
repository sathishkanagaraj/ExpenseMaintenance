package ocpjp6.practice.study_guide.examples.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 2/9/14
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestArrayList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        int i = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = (Integer)iterator.next();
            System.out.println("next = " + next);

        }
    }
}
