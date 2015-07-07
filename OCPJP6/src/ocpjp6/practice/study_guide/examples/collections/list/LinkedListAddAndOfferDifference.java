package ocpjp6.practice.study_guide.examples.collections.list;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 28/8/14
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListAddAndOfferDifference {

    public static void main(String[] args) {
             /* List<Object> list = new ArrayList<Object>();
        list.add(new Animal());
        list.add(new Pig());
        list.add(new Bird());
        for (Object o : list) {
            System.out.println((Animal)o);
        }*/
        LinkedList<Animal> list = new LinkedList<Animal>();
        list.add(new Animal());
        //list.add(new Pig());
        //list.offer(new Object());
        for (Object o : list) {
            System.out.println((Animal)o);
        }
    }
}

class Pig extends Animal {


    @Override
    public String toString() {
        return "Pig{" +
                "name='" + "Pig" + '\'' +
                '}';
    }
}

class Animal{
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + "Animal" + '\'' +
                '}';
    }
}
class Bird{
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + "Bird" + '\'' +
                '}';
    }
}
