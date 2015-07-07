package ocpjp6.practice.sample.tryouts.test;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/8/14
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test1 extends TestClass {

    @Override
    public String getName(String name) {
        getName("");
        return super.getName(name);
    }

    public void checkProtected(){
      getName("");
        getName1("");
    }
}
