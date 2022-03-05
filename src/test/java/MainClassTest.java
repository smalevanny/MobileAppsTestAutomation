import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Error: getLocalNumber() returns " + this.getLocalNumber() + " which is not 14" , this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Error: getLocalNumber() returns " + this.getLocalNumber() + " which less than 45", this.getClassNumber() > 45);
    }
}
