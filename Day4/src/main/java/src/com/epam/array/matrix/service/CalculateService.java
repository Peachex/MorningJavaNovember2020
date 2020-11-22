package src.com.epam.array.matrix.service;

public class CalculateService {
    public int findRowSum(int[] row) {
        int sum = 0;
        for (int i : row) {
            sum += i;
        }
        return sum;
    }

    public int findMaxElement(int[] row) {
        int result = row[0];
        for (int i : row) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

    public int findMinElement(int[] row) {
        int result = row[0];
        for (int i : row) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }
}
