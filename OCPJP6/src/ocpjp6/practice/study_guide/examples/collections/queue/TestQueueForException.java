package ocpjp6.practice.study_guide.examples.collections.queue;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 1/9/14
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestQueueForException {
    public static void main(String[] args) {
        PriorityQueue<Integer> integersQueue = new PriorityQueue<Integer>();
        Integer[] integerArray = new Integer[9];
        int length = integerArray.length;
        System.out.println("length = " + length);
        for (int i = 0; i < length; i++) {
            integerArray[i]= i;
            integersQueue.offer(integerArray[i]);
        }
        integersQueue.add(11);
        integersQueue.add(11);
        System.out.println("integersQueue size " + integersQueue.size());
    }
}
