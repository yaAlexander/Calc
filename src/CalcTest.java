import org.testng.Assert;
import org.testng.annotations.*;

public class CalcTest {

    @org.testng.annotations.BeforeMethod
    public void setUp() {
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
    }

    @DataProvider()
    public Object[][] testEqualsAdd() {
        return new Object[][] {
                {4.0, 2.0, 2.0},
                {-2.0, -1.0, -1.0},
                {0.0, 0.0, 0.0},
                {Double.MAX_VALUE, 1.7976931348623157E308, 0.0}
        };
    }
    @DataProvider()
    public Object[][] testEqualsNegativeAdd() {
        return new Object[][] {
                {5.0, 2.0, 2.0},
                {0.0, -1.0, -1.0},
                {100.0, 0.0, 0.0},
                {Double.MAX_VALUE, 32698, -1.0}
        };
    }

    @org.testng.annotations.Test(dataProvider = "testEqualsAdd")
    public void testAddition(double result, double one, double two) {
        Assert.assertEquals(result, new Calc().addition(one, two));
    }
    @org.testng.annotations.Test(dataProvider = "testEqualsNegativeAdd")
    public void testAdditionNegative(double result, double one, double two) {
        Assert.assertNotEquals(result, new Calc().addition(one, two));
    }

    @org.testng.annotations.Test
    public void testSubtraction() {
    }

    @org.testng.annotations.Test
    public void testMultiplication() {
    }

    @org.testng.annotations.Test
    public void testDivision() {
    }
}

