package ocpjp6.practice.study_guide.examples.oops.polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 22/8/14
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sathish implements Son {

    @Override
    public Parent getParent() {
        Parent parent = new Kanagaraj();
        return parent;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getAge() {
        return 29;
    }
}
