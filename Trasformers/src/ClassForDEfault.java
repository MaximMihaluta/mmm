import pckg01.com.TestCase2;
import pckg01.com.TestCase3;

public class ClassForDEfault extends TestCase3{
    public static void main(String[] args) {

        TestCase2 tc22 = new TestCase2();
        System.out.println(tc22);

        TestCase3 tc = new TestCase3();
        tc.printYear();

    }
}
