package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class RemoveAFromStringTestCases {

    RemoveAFromString obj;

    @BeforeEach
    void setUp()
    {
        obj = new RemoveAFromString();
    }

    @Test
    void testFirstLetterA()
    {
        Assertions.assertEquals("DCB",obj.removeA("ADCB"));
    }

    @Test
    void testBothLetterA()
    {
        Assertions.assertEquals("BC",obj.removeA("AABC"));
    }

    @Test
    void testSecondLetterA()
    {
        Assertions.assertEquals("CBD",obj.removeA("CABD"));
    }

    @Test
    void testNoneLetterA()
    {
        Assertions.assertEquals("RRJJ",obj.removeA("RRJJ"));
    }

    @Test
    void testStartAndEndLetterA()
    {
        Assertions.assertEquals("BCCA",obj.removeA("ABCCA"));
    }

    @Test
    void testBothAndOnlyLetterA()
    {
        Assertions.assertEquals("",obj.removeA("AA"));
    }

    @Test
    void testSingleLetterA()
    {
        Assertions.assertEquals("",obj.removeA("A"));
    }

    @Test
    void testFirstLetterAInTwoLetters()
    {
        Assertions.assertEquals("C",obj.removeA("AC"));
    }

    @Test
    void testSecondLetterAInTwoLetters()
    {
        Assertions.assertEquals("C",obj.removeA("CA"));
    }

    @Test
    void testBothLetterAInNLetters()
    {
        Assertions.assertEquals("RISHAV",obj.removeA("AARISHAV"));
    }
}