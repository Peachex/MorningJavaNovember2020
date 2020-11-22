package src.com.epam.array.matrix.service;

import src.com.epam.array.matrix.entity.JaggedArray;

public class SortService {
    public void sortRowsByRowsSum(JaggedArray jaggedArray, ParameterArrayCreator creator, CalculateService calculator, boolean fromMinToMax) {
        int[][] result = jaggedArray.getMatrix();
        int functionNumber = 0;
        int[] rowsSumArray = creator.createParameterArray(result, calculator, functionNumber);
        sortRowsByParameter(result, rowsSumArray, fromMinToMax);
    }

    public void sortRowsByMaxElement(JaggedArray jaggedArray, ParameterArrayCreator creator, CalculateService calculator, boolean fromMinToMax) {
        int[][] result = jaggedArray.getMatrix();
        int functionNumber = 1;
        int[] maxElementsArray = creator.createParameterArray(result, calculator, functionNumber);
        sortRowsByParameter(result, maxElementsArray, fromMinToMax);
    }

    public void sortRowsByMinElement(JaggedArray jaggedArray, ParameterArrayCreator creator, CalculateService calculator, boolean fromMinToMax) {
        int[][] result = jaggedArray.getMatrix();
        int functionNumber = 2;
        int[] minElementsArray = creator.createParameterArray(result, calculator, functionNumber);
        sortRowsByParameter(result, minElementsArray, fromMinToMax);
    }

    private void sortRowsByParameter(int[][] result, int[] parameterArray, boolean fromMinToMax) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < parameterArray.length - 1; i++) {
                if (fromMinToMax) {
                    if (parameterArray[i] > parameterArray[i + 1]) {
                        swapElements(parameterArray, i);
                        swapRows(result, i);
                        flag = true;
                    }
                } else {
                    if (parameterArray[i] < parameterArray[i + 1]) {
                        swapRows(result, i);
                        swapElements(parameterArray, i);
                        flag = true;
                    }
                }
            }
        }
    }

    private void swapRows(int[][] matrix, int index) {
        int[] temp = matrix[index];
        matrix[index] = matrix[index + 1];
        matrix[index + 1] = temp;
    }

    private void swapElements(int[] array, int index) {
        int temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }
}
