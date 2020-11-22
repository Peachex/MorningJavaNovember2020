package src.com.epam.array.matrix.service;

public class ParameterArrayCreator {
    public int[] createParameterArray(int[][] matrix, CalculateService calculator, int functionNumber) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < result.length; i++) {
            switch (functionNumber) {
                case 0: {
                    result[i] = calculator.findRowSum(matrix[i]);
                    break;
                }
                case 1: {
                    result[i] = calculator.findMaxElement(matrix[i]);
                    break;
                }
                case 2: {
                    result[i] = calculator.findMinElement(matrix[i]);
                    break;
                }
                default: {
                    functionNumber = 0;
                    break;
                }
            }

        }
        return result;
    }
}
