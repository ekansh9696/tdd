package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {

    Statement getFare(List<Ride> rides)
    {
        Statement invoice=new Statement();
        invoice.generateInvoice(rides.size(), Fare(rides));
        return invoice;
    }

    private double Fare(List<Ride> rides) {
        double fare=0;
        for (Ride ride: rides)
        {
            fare+= ride.farePerRide();
        }
        return fare;
    }

}
