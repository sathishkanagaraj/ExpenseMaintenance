package ocpjp6.practice.study_guide.examples.oops.polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 22/8/14
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Thanagamani implements Parent {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getAge() {
        return 50;
    }
}
