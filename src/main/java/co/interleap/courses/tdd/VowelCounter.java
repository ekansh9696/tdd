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
        for(int i=0;i<input.length();i++)
        {
            char current=input.charAt(i);
            if(current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u')
                count++;
        }
        return count;
    }
}
