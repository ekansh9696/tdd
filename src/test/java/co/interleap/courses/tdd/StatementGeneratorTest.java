package co.interleap.courses.tdd;

import org.junit.*;

import java.util.Arrays;

public class StatementGeneratorTest
{
    private static final double DELTA = .01;
    @Test
    public void noTravel()
    {
        StatementGenerator v= new StatementGenerator();
        Statement statement= v.getFare(Arrays.asList(new Ride(0,0)));
        Assert.assertEquals(1,statement.getNumberofrides());
        Assert.assertEquals(0,statement.getTotalfare(),DELTA);
        Assert.assertEquals(0,statement.getAvgfare(),DELTA);
    }
    @Test
    public void minTravel()
    {
        StatementGenerator v = new StatementGenerator();
        Statement statement= v.getFare(Arrays.asList(new Ride(1,5)));
        Assert.assertEquals(1,statement.getNumberofrides());
        Assert.assertEquals(15.0,statement.getTotalfare(),DELTA);
        Assert.assertEquals(15.0,statement.getAvgfare(),DELTA);
    }
    @Test
    public void distanceInDecimalsSingleRide()
    {
        StatementGenerator v = new StatementGenerator();
        Statement statement= v.getFare(Arrays.asList(new Ride(2.5,30)));
        Assert.assertEquals(1,statement.getNumberofrides());
        Assert.assertEquals(55.0,statement.getTotalfare(),DELTA);
        Assert.assertEquals(55.0,statement.getAvgfare(),DELTA);
    }
    @Test
    public void multipleRides()
    {
        StatementGenerator v = new StatementGenerator();
        Statement statement= v.getFare(Arrays.asList(new Ride(2.5,30),new Ride(1,5),new Ride(12,45)));
        Assert.assertEquals(3,statement.getNumberofrides());
        Assert.assertEquals(235.0,statement.getTotalfare(),DELTA);
        Assert.assertEquals(78.33,statement.getAvgfare(),DELTA);
    }

}
