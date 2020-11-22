package com.epam.array.single.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import src.com.epam.array.single.entity.SingleArray;
import src.com.epam.array.single.service.CustomCreator;
import src.com.epam.array.single.service.LogicService;
import src.com.epam.array.single.service.SearchService;

public class SearchServiceTest {
    @Test
    public void binarySearchTest() {
        int[] numbers = {1, 2, 9, 8, 3, 4, 6, 5};
        SingleArray array = new SingleArray(false, numbers);
        SearchService searcher = new SearchService();
        int key = 3;
        boolean condition = searcher.binarySearch(array, key);
        assertTrue(condition);
    }

    @Test
    public void findMaxElementTest() {
        int expected = 9;
        int[] numbers = {1, 2, 9, 8, 3, 4, 6, 5};
        SingleArray array = new SingleArray(false, numbers);
        SearchService searcher = new SearchService();
        int actual = searcher.findMaxElement(array);
        assertEquals(actual, expected);
    }

    @Test
    public void findMinElementTest() {
        int expected = -8;
        int[] numbers = {1, 2, 9, -8, 3, 4, 6, 5};
        SingleArray array = new SingleArray(false, numbers);
        SearchService searcher = new SearchService();
        int actual = searcher.findMinElement(array);
        assertEquals(actual, expected);
    }

    @Test
    public void findSimpleNumbersTest() {
        int[] expected = {1, 2, 3, 17, 5};
        int[] numbers = {1, 2, 9, -8, 3, 17, 6, 5};
        SingleArray array = new SingleArray(false, numbers);
        SearchService searcher = new SearchService();
        LogicService logic = new LogicService();
        int[] actual = searcher.findSimpleNumbers(array, logic);
        assertEquals(actual, expected);
    }

    @Test
    public void findFibonacciNumbersTest() {
        int[] expected = {1, 2, 3, 5};
        int[] numbers = {1, 2, 9, -8, 3, 17, 6, 5};
        SingleArray array = new SingleArray(false, numbers);
        SearchService searcher = new SearchService();
        CustomCreator creator = new CustomCreator();
        LogicService logic = new LogicService();
        int[] actual = searcher.findFibonacciNumbers(array, creator, logic);
        assertEquals(actual, expected);
    }

    @Test
    public void findNumbersWithDifferentDigitsTest() {
        int[] expected = {123, 214, 901, 324};
        int[] numbers = {112, 123, 214, 212, 900, 901, 909, 324};
        SingleArray array = new SingleArray(false, numbers);
        SearchService searcher = new SearchService();
        LogicService logic = new LogicService();
        CustomCreator creator = new CustomCreator();
        int digitsAmount = 3;
        int[] actual = searcher.findNumbersWithDifferentDigits(array, creator, logic, digitsAmount);
        assertEquals(actual, expected);
    }
}
