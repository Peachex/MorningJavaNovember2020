package com.epam.lastdigit.service;

import com.epam.lastdigit.entity.Number;;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberServiceTest {
    @Test
    public void findLastDigitTest() {
        Number number = new Number(123);
        NumberService service = new NumberService();
        int expected = 3;
        int actual = service.findLastDigit(number).getValue();
        assertEquals(actual, expected);
    }

    @Test
    public void findLastDigitOfSquareTest() {
        int expected = 9;
        Number lastDigit = new Number(3);
        NumberService service = new NumberService();
        int actual = service.findLastDigitOfSquare(lastDigit).getValue();
        assertEquals(actual, expected);
    }
}
