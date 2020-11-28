package com.epam.array.single.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.epam.array.single.entity.SingleArray;

public class SortServiceTest {
    private int[] expectedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private SingleArray expected = new SingleArray(expectedNumbers);
    private int[] numbers = {1, 9, 6, 7, 8, 4, 2, 3, 10, 5};
    private SingleArray actual = new SingleArray(numbers);
    private SortService sorter = new SortService();

    @Test
    public void sortArrayWithShellSortTest() {
        sorter.sortArrayWithShellSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void sortArrayWithQuickSort() {
        sorter.sortArrayWithQuickSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void sortArrayWithMergeSortTest() {
        sorter.sortArrayWithMergeSort(actual);
        assertEquals(actual, expected);
    }
}