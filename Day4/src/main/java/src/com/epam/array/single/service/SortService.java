package src.com.epam.array.single.service;

import src.com.epam.array.single.entity.SingleArray;

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
        array.setSorted(true);
    }

    public void sortArrayWithQuickSort(SingleArray array) {
        int leftBorder = 0;
        int rightBorder = array.findSize() - 1;
        quickSort(array, leftBorder, rightBorder);
        array.setSorted(true);
    }

    public void sortArrayWithMergeSort(SingleArray array) {
        int[] result = array.getArray();
        mergeSort(result);
        array.setSorted(true);
    }

    private void quickSort(SingleArray array, int leftBorder, int rightBorder) {
        int[] result = array.getArray();
        int left = leftBorder;
        int right = rightBorder;
        int pivot = result[(left + right) / 2];
        do {
            while (result[left] < pivot) {
                left++;
            }
            while (result[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(result, left, right);
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
