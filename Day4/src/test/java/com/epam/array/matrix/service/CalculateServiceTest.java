package com.epam.array.matrix.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import src.com.epam.array.matrix.service.CalculateService;

public class CalculateServiceTest {
    @Test
    public void findRowSumTest() {
        int expected = 10;
        CalculateService calculator = new CalculateService();
        int[] row = {1, 2, 3, 4};
        int actual = calculator.findRowSum(row);
        assertEquals(actual, expected);
    }

    @Test
    public void findMaxElementTest() {
        int expected = 10;
        CalculateService calculator = new CalculateService();
        int[] row = {1, 2, 3, 4, -2, 10};
        int actual = calculator.findMaxElement(row);
        assertEquals(actual, expected);
    }

    @Test
    public void findMinElementTest() {
        int expected = -2;
        CalculateService calculator = new CalculateService();
        int[] row = {1, 2, 3, 4, -2, 10};
        int actual = calculator.findMinElement(row);
        assertEquals(actual, expected);
    }
}
