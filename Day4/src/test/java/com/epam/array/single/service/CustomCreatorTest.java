package com.epam.array.single.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import src.com.epam.array.single.service.CustomCreator;

public class CustomCreatorTest {
    @Test
    public void createFibonacciNumbersArrayTest() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        CustomCreator creator = new CustomCreator();
        int maxElement = 21;
        int[] actual = creator.createFibonacciNumbersArray(maxElement);
        assertEquals(actual, expected);
    }

    @Test
    public void createDigitsArrayTest() {
        int[] expected = {1, 2, 3, 4, 5, 1};
        CustomCreator creator = new CustomCreator();
        int number = 123451;
        int[] actual = creator.createDigitsArray(number);
        assertEquals(actual, expected);
    }
}
