package ocpjp6.practice.study_guide.examples.collections.list.custom;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 2/9/14
 * Time: 1:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyArraylist<E> implements List<E> {

    transient int firstIndex;
    transient int lastIndex;
    //define element Array
    private E[] elementArray;

    //sets default size 10 and it can only add up to 10 elements.
    public MyArraylist() {
        elementArray = (E[]) new Object[10];
    }

    private class MyIterator implements Iterator<E>{

        int position = -1;
        int lastPosition = -1;

        @Override
        public boolean hasNext() {
            return position+1 <size();
        }

        @Override
        public E next() {
            E result = get(position+1);
            lastPosition = ++position;
            return result;
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public void add(int location, E object) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean add(E object) {
        elementArray[lastIndex] = object;
        lastIndex++;
        return true;
    }

    @Override
    public boolean addAll(int location, Collection<? extends E> collection) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(Object object) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E get(int location) {

        return elementArray[location];
    }

    @Override
    public int indexOf(Object object) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ListIterator<E> listIterator(int location) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E remove(int location) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean remove(Object object) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E set(int location, E object) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int size() {
        return lastIndex-firstIndex;
    }

    @Override
    public List<E> subList(int start, int end) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object[] toArray() {
        return new Object[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> T[] toArray(T[] array) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
