package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {
    public static final int FARE_PER_KM=10;
    public static final int FARE_PER_MINUTE=1;
    double getFare(List<Ride> rides)
    {
        double fare=0;
        for (Ride ride: rides)
        {
            fare+= ride.farePerRide();
        }
        return fare;
    }

}
