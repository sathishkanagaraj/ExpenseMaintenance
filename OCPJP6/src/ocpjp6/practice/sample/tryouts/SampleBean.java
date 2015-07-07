package ocpjp6.practice.sample.tryouts;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/8/14
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class SampleBean {
    public final String str = null;
    public SampleBean(String name) {
        this.name = name;
        System.out.println("name = " + name);
    }

    public SampleBean() {

        System.out.println("abstract");
    }

    private String name;
    protected String string = "protected";
    public String haveName() {
        return name;
    }

    public void provideName(String name) {
        this.name = name;
    }

    protected String getName1(String s){
        return "protected";
    }

    public abstract String getAbstractName(String s);

}

