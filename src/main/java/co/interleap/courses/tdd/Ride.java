package co.interleap.courses.tdd;

public class Ride
{
    private static final int FARE_PER_KM=10;
    private static final int FARE_PER_MINUTE=1;
    double distance,minutes;

    public Ride(double d, double m) {
        distance=d;
        minutes=m;
    }

    double farePerRide() {
        return distance * FARE_PER_KM + minutes * FARE_PER_MINUTE;
    }
}
