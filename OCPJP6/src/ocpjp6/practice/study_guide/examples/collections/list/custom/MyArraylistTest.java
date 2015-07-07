package ocpjp6.practice.study_guide.examples.collections.list.custom;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 2/9/14
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyArraylistTest {

    private List<String> myArraylist;

    @Before
    public  void setUp() throws Exception {

        myArraylist = new MyArraylist<String>();
    }

    @Test
    public void testAdd() throws Exception {
         assertTrue(myArraylist.add("successfully added string element"));
    }

    @Test
    public void testSize() throws Exception {
        testAdd();
      assertEquals(1,myArraylist.size());
        testAdd();
        assertEquals(2,myArraylist.size());
    }

    @Test
    public void testGet() throws Exception {
        testAdd();
        assertEquals("successfully added string element", myArraylist.get(0));
    }

    @Test
    public void testIterator() throws Exception {
        final List<String> strings = new ArrayList<String>();
        testAdd();
        Iterator<String> iterator = myArraylist.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            strings.add(next);
        }
        assertNotNull(strings.contains(myArraylist.get(0)));

    }
}
