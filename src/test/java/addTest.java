import org.junit.Assert;
import org.junit.Test;

public class addTest {

    @Test
    public void addTest(){
        int sum = Addition.add(4,5);
        Assert.assertEquals(9, sum);
    }
}
