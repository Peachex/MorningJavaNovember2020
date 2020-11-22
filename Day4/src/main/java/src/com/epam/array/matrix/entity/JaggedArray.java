package src.com.epam.array.matrix.entity;

import java.util.Arrays;

public class JaggedArray {
    private int[][] matrix;

    public JaggedArray(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int findRowsAmount() {
        return this.matrix.length;
    }

    public int findColumnsAmount(int row) {
        return this.matrix[row].length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JaggedArray{");
        sb.append("matrix=").append(Arrays.toString(matrix));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JaggedArray)) return false;
        JaggedArray that = (JaggedArray) o;
        return Arrays.equals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }
}
