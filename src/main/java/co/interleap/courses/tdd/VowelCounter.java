package co.interleap.courses.tdd;

import java.util.Arrays;

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
            count = updateIfVowel(count, input.charAt(i));
        }
        return count;
    }

    private int updateIfVowel(int count, char current) {
        if(current =='a' || current =='A' || current =='e' || current =='E' || current =='i' || current =='I' || current =='o' || current =='O' || current =='u' || current =='U')
            count++;
        return count;
    }
}
