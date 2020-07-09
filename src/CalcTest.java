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
        return new Object[][]{
                {4.0, 2.0, 2.0},
                {-2.0, -1.0, -1.0},
                {0.0, 0.0, 0.0},
                {Double.MAX_VALUE, 1.7976931348623157E308, 0.0}
        };
    }

    @DataProvider()
    public Object[][] testEqualsNegativeAdd() {
        return new Object[][]{
                {5.0, 2.0, 2.0},
                {0.0, -1.0, -1.0},
                {100.0, 0.0, 0.0},
                {Double.MAX_VALUE, 32698.0, -1.0}
        };
    }

    // Тест для соложения
    @org.testng.annotations.Test(dataProvider = "testEqualsAdd")
    public void testAddition(Object result, Object one, Object two) {
        Assert.assertEquals(result, new Calc().addition(one, two));
    }

    // Негативный тест для сложения
    @org.testng.annotations.Test(dataProvider = "testEqualsNegativeAdd")
    public void testAdditionNegative(Object result, Object one, Object two) {
        Assert.assertNotEquals(result, new Calc().addition(one, two));
    }

    @DataProvider()
    public Object[][] testEqualSub() {
        return new Object[][]{
                {0.0, 2.0, 2.0},
                {-100.0, -50.0, 50.0},
                {0.0, 0.0, 0.0},
                {70.0, -30.0, -100.0}
        };
    }

    @DataProvider()
    public Object[][] testEqualsNegativeSub() {
        return new Object[][]{
                {15.0, 2.0, 2.0},
                {0.0, -1.0, 12.0},
                {100.0, 0.0, 0.0},
                {Double.MAX_VALUE, 32698.0, -1.0}
        };
    }

    // Тест для вычитания
    @org.testng.annotations.Test(dataProvider = "testEqualSub")
    public void testSubtraction(Object result, Object one, Object two) {
        Assert.assertEquals(result, new Calc().subtraction(one, two));
    }

    // Негативный тест для вычитания
    @org.testng.annotations.Test(dataProvider = "testEqualsNegativeSub")
    public void testEqualsNegativeSub(Object result, Object one, Object two) {
        Assert.assertNotEquals(result, new Calc().subtraction(one, two));
    }

    @DataProvider()
    public Object[][] testEqualMul() {
        return new Object[][]{
                {0.0, 0.0, 0.0},
                {-10000.0, -100.0, 100.0},
                {-512.0, -128.0, 4.0},
                {25.0, -5.0, -5.0}
        };
    }

    @DataProvider()
    public Object[][] testEqualsNegativeMul() {
        return new Object[][]{
                {5.0, 2.0, 2.0},
                {0.0, 99.0, 12.0},
                {100.0, 3.0, 0.0},
                {Double.MAX_VALUE, 0.35, -1.0}
        };
    }

    // Тест для умножения
    @org.testng.annotations.Test(dataProvider = "testEqualMul")
    public void testMultiplication(Object result, Object one, Object two) {
        Assert.assertEquals(result, new Calc().multiplication(one, two));
    }

    // Негативный тест для умножения
    @org.testng.annotations.Test(dataProvider = "testEqualsNegativeMul")
    public void testEqualsNegativeMul(Object result, Object one, Object two) {
        Assert.assertNotEquals(result, new Calc().multiplication(one, two));
    }

    @DataProvider()
    public Object[][] testEqualDiv() {
        return new Object[][]{
                {0.0, 0.0, 1.0},
                {100.0, -1000.0, -10.0},
                {-1024.0, -2048.0, 2.0},
                {25.0, -125.0, -5.0}
        };
    }

    @DataProvider()
    public Object[][] testEqualsNegativeDiv() {
        return new Object[][]{
                {5.0, 2.0, 2.0},
                {0.0, 99.0, 0.0},
                {500.0, 326.0, 7.0},
                {Double.MAX_VALUE, 60000.35, -1.6}
        };
    }

    // Тест для деления
    @org.testng.annotations.Test(dataProvider = "testEqualDiv")
    public void testDivision(Object result, Object one, Object two) {
        Assert.assertEquals(result, new Calc().division(one, two));
    }

    // Негативный тест для деления
    @org.testng.annotations.Test(dataProvider = "testEqualsNegativeDiv")
    public void testEqualsNegativeDiv(Object result, Object one, Object two) {
        Assert.assertNotEquals(result, new Calc().division(one, two));
    }
}

