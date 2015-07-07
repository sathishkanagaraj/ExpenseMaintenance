import org.junit.runner.JUnitCore;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/9/14
 * Time: 6:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class RandomTest {

    public static void main(String... args) {
        System.out.println(RandomTest.class.getClassLoader().getParent());
        System.out.println(JUnitCore.class.getClassLoader());

    }
}
