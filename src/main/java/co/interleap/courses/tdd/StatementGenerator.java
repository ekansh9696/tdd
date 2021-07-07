package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {

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
