import com.microsoft.demo.Demo;
import com.microsoft.demo.Pipeline_Test;
import org.junit.Test;

public class MyTest {

    Pipeline_Test pt = new Pipeline_Test();
    String s ="ABCDEFG";
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
    }

    @Test
    public void test_method_3(){
        String rev = pt.MyTestPipeline(s);
        if (rev.length()==7)
            System.out.println("Test Passed on Length");

    }

    @Test
    public void test_check_length(){
        String rev = pt.MyTestPipeline(s);
        if (rev.length()<9)
            System.out.println("Length Not Matching..!");
    }
}