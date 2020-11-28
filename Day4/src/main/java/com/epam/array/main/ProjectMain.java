package com.epam.array.single.main;

import com.epam.array.single.creator.SingleArrayCreator;
import com.epam.array.single.entity.SingleArray;
import com.epam.array.single.report.SingleArrayReport;
import com.epam.array.single.service.SearchService;
import com.epam.array.single.service.SortService;

public class ProjectMain {
    public static void main(String[] args) {
        SingleArrayCreator creator = new SingleArrayCreator();
        String path = "data\\array.txt";
        SingleArray array = creator.createSingleArray(path);

        SingleArrayReport reporter = new SingleArrayReport();
        String message1 = "Array: ";
        reporter.reportArray(array, message1);

        SortService sorter = new SortService();
        sorter.sortArrayWithQuickSort(array);
        String message2 = "Sorted array: ";
        reporter.reportArray(array, message2);

        SearchService searcher = new SearchService();
        int key = 10;
        boolean isInArray = searcher.findWithBinarySearch(array, key);
        reporter.reportBinarySearchResult(array, key, isInArray);

        int maxElement = array.getElement(searcher.findMaxElementIndex(array));
        String message3 = "Max element = ";
        reporter.reportElement(array, maxElement, message3);

        int minElement = array.getElement(searcher.findMinElementIndex(array));
        String message4 = "Min element = ";
        reporter.reportElement(array, minElement, message4);

        SingleArray simpleNumbers = new SingleArray(searcher.findSimpleNumbers(array));
        String message5 = "Simple numbers: ";
        reporter.reportArray(simpleNumbers, message5);

        SingleArray fibonacciNumbers = new SingleArray(searcher.findFibonacciNumbers(array));
        String message6 = "Fibonacci numbers: ";
        reporter.reportArray(fibonacciNumbers, message6);

        int digitsAmount = 3;
        SingleArray numbersWithDifferentDigits = new SingleArray(searcher.findNumbersWithDifferentDigits(array, digitsAmount));
        String message7 = "Numbers with different digits: ";
        reporter.reportArray(numbersWithDifferentDigits, message7);
    }
}