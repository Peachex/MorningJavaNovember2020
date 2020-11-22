package com.epam.array.matrix.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import src.com.epam.array.matrix.service.CalculateService;
import src.com.epam.array.matrix.service.ParameterArrayCreator;

public class ParameterArrayCreatorTest {
    @Test
    public void createParameterArrayTest() {
        int[] expected = {6, 10, 100};
        int[][] matrix = {
                {1, 2, 3},
                {10},
                {100},
        };
        ParameterArrayCreator creator = new ParameterArrayCreator();
        CalculateService calculate = new CalculateService();
        int functionNumber = 0;
        int[] actual = creator.createParameterArray(matrix, calculate, functionNumber);
        assertEquals(actual, expected);
    }
}
