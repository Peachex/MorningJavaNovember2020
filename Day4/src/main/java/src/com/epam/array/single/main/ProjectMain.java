package src.com.epam.array.single.main;

import src.com.epam.array.single.entity.SingleArray;
import src.com.epam.array.single.report.SingleArrayReport;
import src.com.epam.array.single.service.CustomCreator;
import src.com.epam.array.single.service.LogicService;
import src.com.epam.array.single.service.SearchService;
import src.com.epam.array.single.service.SortService;
import src.com.epam.array.single.utils.ArrayDataReader;

public class ProjectMain {
    public static void main(String[] args) {
        ArrayDataReader reader = new ArrayDataReader();
        SingleArray randomArray = new SingleArray(false, reader, 10, 21);
        String path = "src\\main\\resources\\Array.bin";
        SingleArray arrayFromFile = new SingleArray(false, reader, path);
        SingleArray arrayFromConsole = new SingleArray(false, reader, 10);

        SingleArrayReport reporter = new SingleArrayReport();
        String message1 = "Random array: ";
        reporter.reportArray(randomArray, message1);
        String message2 = "Array from file: ";
        reporter.reportArray(arrayFromFile, message2);
        String message3 = "Array from console: ";
        reporter.reportArray(arrayFromConsole, message3);

        SortService sorter = new SortService();
        sorter.sortArrayWithShellSort(randomArray);
        sorter.sortArrayWithQuickSort(arrayFromFile);
        sorter.sortArrayWithMergeSort(arrayFromConsole);

        String message4 = "Random array, sorted with Shell sort: ";
        reporter.reportArray(randomArray, message4);
        String message5 = "Array from file, sorted with quick sort: ";
        reporter.reportArray(arrayFromFile, message5);
        String message6 = "Array from console, sorted with merge sort: ";
        reporter.reportArray(arrayFromConsole, message6);

        SearchService searcher = new SearchService();
        int key = 10;
        boolean isInArray = searcher.binarySearch(arrayFromFile, key);
        reporter.reportBinarySearchResult(arrayFromFile, key, isInArray);

        int maxElement = searcher.findMaxElement(randomArray);
        String message7 = "Max element = ";
        reporter.reportElement(randomArray, maxElement, message7);

        int minElement = searcher.findMinElement(randomArray);
        String message8 = "Min element = ";
        reporter.reportElement(randomArray, minElement, message8);

        LogicService logic = new LogicService();
        SingleArray simpleNumbers = new SingleArray(false, searcher.findSimpleNumbers(arrayFromFile, logic));
        String message9 = "Simple numbers from the array(file): ";
        reporter.reportArray(simpleNumbers, message9);

        CustomCreator creator = new CustomCreator();
        SingleArray fibonacciNumbers = new SingleArray(false, searcher.findFibonacciNumbers(arrayFromFile, creator, logic));
        String message10 = "Fibonacci numbers from the array(file): ";
        reporter.reportArray(fibonacciNumbers, message10);

        int digitsAmount = 3;
        SingleArray numbersWithDifferentDigits = new SingleArray(false, searcher.findNumbersWithDifferentDigits(arrayFromConsole, creator, logic, 3));
        String message11 = "Numbers with different digits from the array(console): ";
        reporter.reportArray(numbersWithDifferentDigits, message11);
    }
}
