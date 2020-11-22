package com.epam.array.single.service;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import src.com.epam.array.single.service.CustomCreator;
import src.com.epam.array.single.service.LogicService;


public class LogicServiceTest {
    @Test
    public void checkNumberForSimplicityTest() {
        LogicService logic = new LogicService();
        int number = 17;
        boolean condition = logic.checkNumberForSimplicity(number);
        assertTrue(condition);
    }

    @Test
    public void checkNumberForFibonacciTest() {
        LogicService logic = new LogicService();
        int number = 21;
        CustomCreator creator = new CustomCreator();
        int[] fibonacciNumbers = creator.createFibonacciNumbersArray(number);
        boolean condition = logic.checkNumberForFibonacci(number, fibonacciNumbers);
        assertTrue(condition);
    }

    @Test
    public void checkNumberForDifferentDigitsTest() {
        LogicService logic = new LogicService();
        int number = 12345;
        CustomCreator creator = new CustomCreator();
        int[] digits = creator.createDigitsArray(number);
        boolean condition = logic.checkNumberForDifferentDigits(digits);
        assertTrue(condition);
    }
}
