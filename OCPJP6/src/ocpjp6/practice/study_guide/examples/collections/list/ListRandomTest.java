package ocpjp6.practice.study_guide.examples.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 28/8/14
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListRandomTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1129312.123123);
        list.add("1");
        list.add(new Object());
        System.out.println("list = " + list.size());

        LinkedList<String> linkedList = new LinkedList<String>(list);
        linkedList.add(new String());
       /* System.out.println("linkedList.poll() = " + linkedList.offer(list));*/
        System.out.println("linkedList = " + linkedList);
    }
}
