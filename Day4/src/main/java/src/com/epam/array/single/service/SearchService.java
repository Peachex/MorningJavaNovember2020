package src.com.epam.array.single.service;

import src.com.epam.array.single.entity.SingleArray;

public class SearchService {
    public boolean binarySearch(SingleArray array, int key) {
        if (!array.isSorted()) {
            SortService sort = new SortService();
            sort.sortArrayWithQuickSort(array);
        }
        int[] resultArray = array.getArray();
        int low = 0;
        int high = resultArray.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int middleValue = resultArray[(low + high) / 2];
            if (middleValue < key) {
                low = middle + 1;
            } else {
                if (middleValue > key) {
                    high = middle - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public int findMaxElement(SingleArray array) {
        int[] resultArray = array.getArray();
        int result = resultArray[0];
        for (int i : resultArray) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

    public int findMinElement(SingleArray array) {
        int[] resultArray = array.getArray();
        int result = resultArray[0];
        for (int i : resultArray) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    public int[] findSimpleNumbers(SingleArray array, LogicService logic) {
        int[] cloneArray = copyArray(array);
        int count = 0;
        for (int i = 0; i < cloneArray.length; i++) {
            if (logic.checkNumberForSimplicity(cloneArray[i])) {
                count++;
            } else {
                cloneArray[i] = 0;
            }
        }
        return fillResultArray(array, cloneArray, count);
    }

    public int[] findFibonacciNumbers(SingleArray array, CustomCreator creator, LogicService logic) {
        int[] cloneArray = copyArray(array);
        int[] fibonacciNumbers = creator.createFibonacciNumbersArray(findMaxElement(array));
        int count = 0;
        for (int i = 0; i < cloneArray.length; i++) {
            if (logic.checkNumberForFibonacci(cloneArray[i], fibonacciNumbers)) {
                count++;
            } else {
                cloneArray[i] = 0;
            }
        }
        return fillResultArray(array, cloneArray, count);
    }

    public int[] findNumbersWithDifferentDigits(SingleArray array, CustomCreator creator, LogicService logic, int digitsAmount) {
        int[] cloneArray = copyArray(array);
        int count = 0;
        int minLimit = (int) Math.pow(10, digitsAmount - 1) - 1;
        int maxLimit = (int) Math.pow(10, digitsAmount) - 1;
        for (int i = 0; i < cloneArray.length; i++) {
            if (Math.abs(cloneArray[i]) > minLimit && Math.abs(cloneArray[i]) < maxLimit) {
                if (logic.checkNumberForDifferentDigits(creator.createDigitsArray(cloneArray[i]))) {
                    count++;
                } else {
                    cloneArray[i] = 0;
                }
            } else {
                cloneArray[i] = 0;
            }
        }
        return fillResultArray(array, cloneArray, count);
    }

    private int[] fillResultArray(SingleArray array, int[] cloneArray, int count) {
        int[] resultArray = new int[count];
        count = 0;
        for (int i = 0; i < array.findSize(); i++) {
            if (cloneArray[i] != 0) {
                resultArray[count++] = cloneArray[i];
            }
        }
        return resultArray;
    }

    private int[] copyArray(SingleArray array) {
        int[] result = new int[array.findSize()];
        for (int i = 0; i < array.findSize(); i++) {
            result[i] = array.getArray()[i];
        }
        return result;
    }
}
