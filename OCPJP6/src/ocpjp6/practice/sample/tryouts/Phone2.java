package ocpjp6.practice.sample.tryouts;

import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/8/14
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Phone2 extends Electronic implements Device{

    public void doIt(int x){

    }

    public void say(){
        System.out.println("hi subclass");
    }

    public Phone2 sayPhone(){
        return new Phone2();
    }

    public static void main(String[] args) {
        Electronic electronic = new Electronic();
        Phone2 electronic1 = new Phone2();
        try {
            electronic.say();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        electronic1.say();

    }

}
