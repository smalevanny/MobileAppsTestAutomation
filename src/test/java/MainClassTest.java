import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Error: getLocalNumber() returns " + this.getLocalNumber() + " which is not 14" , this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Error: getClassNumber() returns " + this.getClassNumber() + " which less than 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("Error: getClassString() returns \"" + this.getClassString() + "\" which doesn't contain \"hello\" nor \"Hello\"",
                this.getClassString().contains("hello") || this.getClassString().contains("Hello"));
    }

}
