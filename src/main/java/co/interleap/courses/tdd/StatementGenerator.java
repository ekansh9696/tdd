package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {
    private int numberofrides;
    private double totalfare;
    private double avgfare;
    int getNumberofrides(){return numberofrides;}
    double getTotalfare(){return totalfare;}
    double getAvgfare(){return avgfare;}

    void getFare(List<Ride> rides) {
        generateInvoice(rides.size(), Fare(rides));
    }

    private double Fare(List<Ride> rides) {
        double fare=0;
        for (Ride ride: rides)
        {
            fare+= ride.farePerRide();
        }
        return fare;
    }
    private void generateInvoice(int rides, double fare)
    {
        totalfare=fare;
        avgfare=(fare / rides);
        numberofrides=(rides);
    }

}
