package co.interleap.courses.tdd;

public class Ride
{
    double distance,minutes;

    public Ride(double d, double m) {
        distance=d;
        minutes=m;
    }

    double farePerRide() {
        return distance * StatementGenerator.FARE_PER_KM + minutes * StatementGenerator.FARE_PER_MINUTE;
    }
}
