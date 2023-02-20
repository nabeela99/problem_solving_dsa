package examplecode;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void shouldSum() {
        Calc c = new Calc();
        int expected = c.sum(5, 10);
        Assert.assertEquals(15, expected);
        Assert.assertNotEquals(10, expected);
    }


}
