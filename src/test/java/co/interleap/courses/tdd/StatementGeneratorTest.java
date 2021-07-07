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
        Ride rides[]={new Ride(0,0)};
        double fare= v.getFare(Arrays.asList(rides));
        Assert.assertEquals(0.0,fare,DELTA);
    }
    @Test
    public void minTravel()
    {
        StatementGenerator v = new StatementGenerator();
        Ride rides[]={new Ride(1,5)};
        double fare= v.getFare(Arrays.asList(rides));
        Assert.assertEquals(15.0,fare,DELTA);
    }
    @Test
    public void distanceInDecimalsSingleRide()
    {
        StatementGenerator v = new StatementGenerator();
        Ride rides[]={new Ride(2.5,30)};
        double fare= v.getFare(Arrays.asList(rides));
        Assert.assertEquals(55.0,fare,DELTA);
    }
    @Test
    public void multipleRides()
    {
        StatementGenerator v = new StatementGenerator();
        Ride rides[]={new Ride(2.5,30),new Ride(1,5),new Ride(12,45)};
        double fare= v.getFare(Arrays.asList(rides));
        Assert.assertEquals(235,fare,DELTA);
    }

}
