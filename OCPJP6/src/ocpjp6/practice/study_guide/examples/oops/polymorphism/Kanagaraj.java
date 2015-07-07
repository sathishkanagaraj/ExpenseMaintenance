package ocpjp6.practice.study_guide.examples.oops.polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 22/8/14
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Kanagaraj implements Parent {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getAge() {
        return 60;
    }

    public String getKanagaraj(){
        return "kanagaraj";
    }
}
