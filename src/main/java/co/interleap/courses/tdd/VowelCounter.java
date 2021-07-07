package co.interleap.courses.tdd;


public class VowelCounter {
    String input;
    VowelCounter(String value)
    {
        input=value;
    }
    public int getCount()
    {
        return iterateThroughString();
    }

    private int iterateThroughString() {
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            count = updateIfVowel(count, input.substring(i,i+1));
        }
        return count;
    }

    private int updateIfVowel(int count, String current) {
        if("aeiouAEIOU".contains(current))
            count++;
        return count;
    }
}
