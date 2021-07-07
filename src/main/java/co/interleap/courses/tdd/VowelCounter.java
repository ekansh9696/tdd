package co.interleap.courses.tdd;

public class VowelCounter {
    String input;
    VowelCounter(String value)
    {
        input=value;
    }
    public int getCount()
    {
        int count=0;
        count=input.length();
        return count;
    }
}