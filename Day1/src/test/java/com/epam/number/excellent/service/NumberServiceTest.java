package com.epam.number.excellent.service;

import com.epam.number.excellent.entity.Number;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NumberServiceTest {
    @Test
    public void findDivisorsSumTest() {
        Number number = new Number(28);
        NumberService service = new NumberService();
        int expected = 28;
        int actual = service.findDivisorsSum(number);
        assertEquals(actual, expected);
    }

    @Test
    public void divisorsSumEqualsNumberTest() {
        Number number = new Number(28);
        NumberService service = new NumberService();
        int divisorsSum = 28;
        boolean actual = service.divisorsSumEqualsNumber(divisorsSum, number);
        assertTrue(actual);
    }
}
