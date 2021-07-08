package co.interleap.courses.tdd;

import java.util.List;

public class Statement {
   private int numberofrides=0;
   private double totalfare=0;
   private double avgfare=0;
    void setNumberofrides(int numberofrides1)
    {
        numberofrides=numberofrides1;
    }
    void setTotalfare(double totalfare1)
    {
        totalfare=totalfare1;
    }
    void setAvgfare(double avgfare1)
    {
        avgfare=avgfare1;
    }
    int getNumberofrides(){return numberofrides;}
    double getTotalfare(){return totalfare;}
    double getAvgfare(){return avgfare;}
    void generateInvoice(int rides, double fare)
    {
        setTotalfare(fare);
        setAvgfare(fare / rides);
        setNumberofrides(rides);
    }
}
