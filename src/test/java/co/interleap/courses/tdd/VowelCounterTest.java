package co.interleap.courses.tdd;

import org.junit.*;

public class VowelCounterTest {

    @Test
    public void emptyString()
    {
        VowelCounter v = new VowelCounter("");
        Assert.assertEquals(0,v.getCount());
    }
    @Test
    public void singleVowelString()
    {
        VowelCounter v = new VowelCounter("e");
        Assert.assertEquals(1,v.getCount());
    }
    @Test
    public void allVowelString()
    {
        VowelCounter v = new VowelCounter("aeiou");
        Assert.assertEquals(5,v.getCount());
    }
    @Test
    public void singleConsonantString()
    {
        VowelCounter v = new VowelCounter("h");
        Assert.assertEquals(0,v.getCount());
    }
    @Test
    public void complexStringLowerCaseOnly()
    {
        VowelCounter v = new VowelCounter("hello there");
        Assert.assertEquals(4,v.getCount());
    }
}