package co.interleap.courses.tdd;

public class StatementGenerator {
    public static final int FARE_PER_KM=10;
    public static final int FARE_PER_MINUTE=1;
    double getFare(double distance,int minutes)
    {
        return distance*FARE_PER_KM+minutes*FARE_PER_MINUTE;
    }

}
