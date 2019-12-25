import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void firstTest(){
        MainClass mainClass = new MainClass();
        int exceptedValue = mainClass.getLocalNumber();
        Assert.assertEquals("the returned value is not 14 ! ", 15, exceptedValue);
    }
}
