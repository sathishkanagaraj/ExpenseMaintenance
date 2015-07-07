package ocpjp6.practice.study_guide.examples.oops.polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 22/8/14
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestPolymorphism {
    private static Son son;
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
        try {
            Class aClass = Class.forName(args[i]);
            son = (Son)aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("son = " + son.getName());
        System.out.println("son age= " + son.getAge());
        System.out.println("karthik parent= " + son.getParent().getName());
    }
    }
}
