package com.epam.number.even.service;

import com.epam.number.even.entity.Number;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NumberServiceTest {
    @Test
    public void checkNumberForEvennessTest() {
        Number[] numbersArray = {new Number(2), new Number(5), new Number(6), new Number(7)};
        NumberService service = new NumberService();
        boolean actual = service.checkNumberForEvenness(numbersArray);
        assertTrue(actual);
    }
}