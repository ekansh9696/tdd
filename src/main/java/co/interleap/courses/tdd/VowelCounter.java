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
        //char v[]={'a','A','e','E','i','I','o','O','u','U'};
        for(int i=0;i<input.length();i++)
        {
            char current=input.charAt(i);
            //if(Arrays.asList(v).contains(current))
            //    count++;
            if(current=='a' || current=='A' || current=='e' || current=='E' || current=='i' || current=='I' || current=='o' || current=='O' || current=='u' || current=='U')
                count++;
        }
        return count;
    }
}
