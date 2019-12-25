import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void firstTest(){
        MainClass mainClass = new MainClass();
        int exceptedValue = mainClass.getLocalNumber();
        Assert.assertEquals("the returned value is not 14 ! ", 14, exceptedValue);
    }

    @Test
    public void testGetClassNumber(){
        MainClass mainClass = new MainClass();
        Assert.assertTrue("the returned value is not more than  45!" ,
                            mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString(){
        MainClass mainClass = new MainClass();
        String classString = mainClass.getClassString();
        Assert.assertTrue("the string doesn't contain 'hello' or 'Hello'",
                                    classString.contains("hello") || classString.contains("Hello"));
    }
}
