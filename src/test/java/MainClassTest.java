import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Error: getLocalNumber() doesn't return 14", this.getLocalNumber() == 14);
    }
}
