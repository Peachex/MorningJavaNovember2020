package src.com.epam.array.matrix.report;

import src.com.epam.array.matrix.entity.JaggedArray;

public class JaggedArrayReport {
    public void reportArray(JaggedArray jaggedArray, String message) {
        System.out.println(message);
        for (int[] i : jaggedArray.getMatrix()) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
