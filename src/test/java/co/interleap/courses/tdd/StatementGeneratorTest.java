package co.interleap.courses.tdd;

import org.junit.*;

public class StatementGeneratorTest
{
    private static final double DELTA = 1e-15;
    @Test
    public void noTravel()
    {
        StatementGenerator v = new StatementGenerator();
        Assert.assertEquals(0.0,v.getFare(0,0),DELTA);
    }
    @Test
    public void minTravel()
    {
        StatementGenerator v = new StatementGenerator();
        Assert.assertEquals(11.0,v.getFare(1,1),DELTA);
    }
    @Test
    public void distanceInDecimals()
    {
        StatementGenerator v = new StatementGenerator();
        Assert.assertEquals(55.0,v.getFare(2.5,30),DELTA);
    }
}
