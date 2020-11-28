package com.epam.array.single.service;

import com.epam.array.single.entity.SingleArray;

public class SortService {
    public void sortArrayWithShellSort(SingleArray array) {
        int[] result = array.getArray();
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] > result[i + 1]) {
                swap(result, i, i + 1);
                if (i > 0) {
                    i -= 2;
                }
            }
        }
    }

    public void sortArrayWithQuickSort(SingleArray array) {
        int leftBorder = 0;
        int rightBorder = array.getArray().length - 1;
        quickSort(array.getArray(), leftBorder, rightBorder);
    }

    public void sortArrayWithMergeSort(SingleArray array) {
        mergeSort(array.getArray());
    }

    private void quickSort(int[] array, int leftBorder, int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        int pivot = array[(left + right) / 2];
        do {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        } while (left <= right);
        if (left < rightBorder) {
            quickSort(array, left, rightBorder);
        }
        if (right > leftBorder) {
            quickSort(array, leftBorder, right);
        }
    }

    private void mergeSort(int[] array) {
        int[] result = array;
        if (result.length < 2) {
            return;
        }
        int[] leftPart = new int[result.length / 2];
        int[] rightPart = new int[result.length - leftPart.length];
        for (int i = 0; i < leftPart.length; i++) {
            leftPart[i] = result[i];
        }
        for (int i = leftPart.length; i < result.length; i++) {
            rightPart[i - leftPart.length] = result[i];
        }
        mergeSort(leftPart);
        mergeSort(rightPart);
        mergeArray(result, leftPart, rightPart);
    }

    private void mergeArray(int[] array, int[] leftPart, int[] rightPart) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftPart.length && j < rightPart.length) {
            array[k++] = leftPart[i] <= rightPart[j] ? leftPart[i++] : rightPart[j++];
        }
        while (i < leftPart.length) {
            array[k++] = leftPart[i++];
        }
        while (j < rightPart.length) {
            array[k++] = rightPart[j++];
        }
    }

    private void swap(int[] array, int index, int anotherIndex) {
        int temp = array[index];
        array[index] = array[anotherIndex];
        array[anotherIndex] = temp;
    }
}
