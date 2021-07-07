package co.interleap.courses.tdd;

import org.junit.*;

public class StatementGeneratorTest
{
    @Test
    public void noTravel()
    {
        StatementGenerator v = new StatementGenerator();
        Assert.assertEquals(0,v.getFare(0,0));
    }
}
