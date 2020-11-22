package src.com.epam.array.single.report;

import src.com.epam.array.single.entity.SingleArray;

public class SingleArrayReport {
    public void reportArray(SingleArray array, String message) {
        System.out.print(message);
        for (int i : array.getArray()) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
    }

    public void reportBinarySearchResult(SingleArray array, int key, boolean condition) {
        System.out.print(key + (condition ? " - was found" : " - wasn't found") + " in the array (  ");
        for (int i : array.getArray()) {
            System.out.print(i + "\t");
        }
        System.out.println(").\n");
    }

    public void reportElement(SingleArray array,int element, String message) {
        System.out.print(message + element + " (  ");
        for (int i : array.getArray()) {
            System.out.print(i + "\t");
        }
        System.out.println(").\n");
    }
}
