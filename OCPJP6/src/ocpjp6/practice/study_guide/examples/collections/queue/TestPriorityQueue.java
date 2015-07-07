package ocpjp6.practice.study_guide.examples.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/8/14
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestPriorityQueue {
    public static void main(String[] args) {
        Integer[] a = {1,5,3,7,6,9,8,null};
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<Integer>();
        for (int i : a) {
            integerPriorityQueue.offer(i);
        }
        for (int i : a) {
            System.out.println("integerPriorityQueue poll= " + integerPriorityQueue.poll());
        }
        System.out.println("integerPriorityQueue size= " + integerPriorityQueue.size()+"\n");
        System.out.println("");
        PQSort pqSort = new PQSort();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(10,pqSort);
        for (int i : a) {
            priorityQueue.offer(i);
        }
        System.out.println("priorityQueue size= " + priorityQueue.size());
        System.out.println("priorityQueue peek= " + priorityQueue.peek());
        System.out.println("priorityQueue size after peek= " + priorityQueue.size());
        System.out.println("priorityQueue poll= " + priorityQueue.poll());
        System.out.println("priorityQueue size after poll= " + priorityQueue.size());

        for (int i : a) {
            System.out.println("priorityQueue poll= " + priorityQueue.poll());
        }
    }
    static class PQSort implements Comparator<Integer>{

        @Override
        public int compare(Integer object1, Integer object2) {
            return object2-object1;
        }
    }
}
