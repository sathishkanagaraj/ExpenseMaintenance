package ocpjp6.practice.study_guide.assessments.object_orientation;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 8/8/14
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class TryFinally {
    public static void main(String[] args) {
        TestFinally testFinally = new TestFinally();
        System.out.println(testFinally.getName(1));
    }
}

class TestFinally{

    public String getName(int i){
        try{
            i = i/0;
            return "try-name";
        }
        catch (Exception e){
            return "catch-name";
        }
        finally {
            System.out.println("fgfj");
            //return "finally-name";
        }
    }
}