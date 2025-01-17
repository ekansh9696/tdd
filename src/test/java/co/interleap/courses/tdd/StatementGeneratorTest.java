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
         v.getFare(Arrays.asList(new Ride(0,0)));
        Assert.assertEquals(1,v.getNumberofrides());
        Assert.assertEquals(0,v.getTotalfare(),DELTA);
        Assert.assertEquals(0,v.getAvgfare(),DELTA);
    }
    @Test
    public void minTravel()
    {
        StatementGenerator v = new StatementGenerator();
         v.getFare(Arrays.asList(new Ride(1,5)));
        Assert.assertEquals(1,v.getNumberofrides());
        Assert.assertEquals(15.0,v.getTotalfare(),DELTA);
        Assert.assertEquals(15.0,v.getAvgfare(),DELTA);
    }
    @Test
    public void distanceInDecimalsSingleRide()
    {
        StatementGenerator v = new StatementGenerator();
         v.getFare(Arrays.asList(new Ride(2.5,30)));
        Assert.assertEquals(1,v.getNumberofrides());
        Assert.assertEquals(55.0,v.getTotalfare(),DELTA);
        Assert.assertEquals(55.0,v.getAvgfare(),DELTA);
    }
    @Test
    public void multipleRides()
    {
        StatementGenerator v = new StatementGenerator();
         v.getFare(Arrays.asList(new Ride(2.5,30),new Ride(1,5),new Ride(12,45)));
        Assert.assertEquals(3,v.getNumberofrides());
        Assert.assertEquals(235.0,v.getTotalfare(),DELTA);
        Assert.assertEquals(78.33,v.getAvgfare(),DELTA);
    }

}
