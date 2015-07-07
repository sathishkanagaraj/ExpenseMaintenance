package ocpjp6.practice.sample.tryouts;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/8/14
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestSampleBean{

    public static void main(String[] args){
    SampleBean sampleBean = new SampleBean() {
        @Override
        public String getAbstractName(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    };
    sampleBean.provideName("sampleValue");
        System.out.println(sampleBean.haveName());

        UseEnum useEnum = new UseEnum();
        SampleBean sampleBean1 = new SampleBean() {
            @Override
            public String getAbstractName(String s) {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }
        };
        System.out.println(sampleBean1.getName1(""));
        System.out.println(sampleBean1.string);

        int a = 1/10;
        System.out.println("a = " + a);

}
}
