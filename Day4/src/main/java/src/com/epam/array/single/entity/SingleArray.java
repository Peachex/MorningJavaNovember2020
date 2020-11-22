package src.com.epam.array.single.entity;

import src.com.epam.array.single.utils.ArrayDataReader;

import java.util.Arrays;
import java.util.Objects;

public class SingleArray {
    private int[] array;
    private boolean isSorted;

    public SingleArray(boolean isSorted, int... numbers) {
        this.array = numbers;
        this.isSorted = isSorted;
    }

    public SingleArray(boolean isSorted, ArrayDataReader reader, int size, int bound) {
        this.array = reader.readArrayFromRandom(size, bound);
        this.isSorted = isSorted;
    }

    public SingleArray(boolean isSorted, ArrayDataReader reader, int size) {
        this.array = reader.readArrayFromConsole(size);
        this.isSorted = isSorted;
    }

    public SingleArray(boolean isSorted, ArrayDataReader reader, String path) {
        this.array = reader.readArrayFromFile(path);
        this.isSorted = isSorted;
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int findSize() {
        return this.getArray().length;
    }

    public boolean isSorted() {
        return this.isSorted;
    }

    public void setSorted(boolean sorted) {
        this.isSorted = sorted;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingleArray{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append(", isSorted=").append(isSorted);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleArray)) return false;
        SingleArray array1 = (SingleArray) o;
        return isSorted == array1.isSorted &&
                Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isSorted);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
