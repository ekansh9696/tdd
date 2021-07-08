package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {

    Statement getFare(List<Ride> rides)
    {
        Statement invoice=new Statement();
        double fare=0;
        for (Ride ride: rides)
        {
            fare+= ride.farePerRide();
        }
        invoice.setTotalfare(fare);
        invoice.setAvgfare(fare/rides.size());
        invoice.setNumberofrides(rides.size());
        return invoice;
    }

}
