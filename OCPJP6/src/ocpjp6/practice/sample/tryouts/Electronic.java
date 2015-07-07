package ocpjp6.practice.sample.tryouts;

import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/8/14
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Electronic implements Device {
    @Override
    public void doIt() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void say() throws FileNotFoundException{
        System.out.println("hi super");
    }

    public Electronic sayPhone(){
        return  new Electronic();
    }

    public int sayType(){
        return 0;
    }
}
