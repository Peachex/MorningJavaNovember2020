package com.epam.array.matrix.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import src.com.epam.array.matrix.entity.JaggedArray;
import src.com.epam.array.matrix.service.CalculateService;
import src.com.epam.array.matrix.service.ParameterArrayCreator;
import src.com.epam.array.matrix.service.SortService;

public class SortServiceTest {
    @Test
    public void sortRowsByRowsSumTest() {
        int[][] expected = {
                {100},
                {10, 10},
                {1, 2, 3},
        };

        int[][] matrix = {
                {1, 2, 3},
                {10, 10},
                {100},
        };
        JaggedArray jaggedArray = new JaggedArray(matrix);
        SortService sorter = new SortService();
        ParameterArrayCreator creator = new ParameterArrayCreator();
        CalculateService calculator = new CalculateService();
        boolean fromMinToMax = false;
        sorter.sortRowsByRowsSum(jaggedArray, creator, calculator, fromMinToMax);
        int[][] actual = jaggedArray.getMatrix();
        assertEquals(actual, expected);
    }

    @Test
    public void sortRowsByMaxElementTest() {
        int[][] expected = {
                {1, 2, 3},
                {10, 10},
                {100},
        };

        int[][] matrix = {
                {1, 2, 3},
                {10, 10},
                {100},
        };
        JaggedArray jaggedArray = new JaggedArray(matrix);
        SortService sorter = new SortService();
        ParameterArrayCreator creator = new ParameterArrayCreator();
        CalculateService calculator = new CalculateService();
        boolean fromMinToMax = true;
        sorter.sortRowsByMaxElement(jaggedArray, creator, calculator, fromMinToMax);
        int[][] actual = jaggedArray.getMatrix();
        assertEquals(actual, expected);
    }

    @Test
    public void sortRowsByMinElementTest() {
        int[][] expected = {
                {100},
                {10, 10},
                {1, 2, 3},
        };

        int[][] matrix = {
                {1, 2, 3},
                {10, 10},
                {100},
        };
        JaggedArray jaggedArray = new JaggedArray(matrix);
        SortService sorter = new SortService();
        ParameterArrayCreator creator = new ParameterArrayCreator();
        CalculateService calculator = new CalculateService();
        boolean fromMinToMax = false;
        sorter.sortRowsByMinElement(jaggedArray, creator, calculator, fromMinToMax);
        int[][] actual = jaggedArray.getMatrix();
        assertEquals(actual, expected);
    }
}
