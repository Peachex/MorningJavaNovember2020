package src.com.epam.array.single.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;

public class ArrayDataReader {
    public int[] readArrayFromRandom(int size, int bound) {
        Random random = new Random();
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(bound) - 10;
        }
        return result;
    }

    public int[] readArrayFromConsole(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers: ");
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public int[] readArrayFromFile(String path) {
        int[] result = new int[10];
        try {
            FileInputStream is = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(is);
            while (is.available() > 1) {
                result = (int[]) ois.readObject();
            }
            ois.close();
            is.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
