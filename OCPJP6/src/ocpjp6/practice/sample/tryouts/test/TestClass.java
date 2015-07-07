package ocpjp6.practice.sample.tryouts.test;

import ocpjp6.practice.sample.tryouts.SampleBean;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/8/14
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestClass extends SampleBean{

    public String getName(String name){
        return "name";
    }

    public int getName(int name){
        return 0;
    }

    public String getName(int i, float f){
        return "";
    }

    public String getName(float f){
        return "";
    }

   public void testProtectedOutSidePackage(){
    //SampleBean sampleBean = new SampleBean();
   //not allowed--> sampleBean.getName();
       String name = getName1("");
       getName("");
   }


    @Override
    public String getAbstractName(String s) {
        return "abstractName";
    }

    public int getAbstractName(int s) {
        return 0;
    }

    public long giveChar(){
        short c = 'c';
        return c;
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        System.out.println(" from testClass ");
    }
}
