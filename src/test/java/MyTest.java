import com.microsoft.demo.Demo;
import com.microsoft.demo.Pipeline_Test;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void validateRandomPassword(){
        char [] password = pt.random_password(10);
        if(password.length==10)
            System.out.println("Password Length Matched..!");
    }

    @Test
    public void validateSpecialChar() {
        char[] pass = pt.random_password(10);
        boolean bool =  false;
        System.out.println(pass);
        for (int i = 0; i < pass.length; i++) {
            if (Arrays.toString(pass).contains("@")) {
                bool = true;
                break;
            }
        }
        if(bool)
            System.out.println("Password Contains @ Character..!");
        else
            Assert.fail("Password Doesn't contain @ Character..!");
    }
}