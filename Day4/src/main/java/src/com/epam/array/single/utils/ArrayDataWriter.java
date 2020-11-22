package src.com.epam.array.single.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArrayDataWriter {
    public void writeArrayInFile(String path, int[] array) {
        try {
            FileOutputStream os = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(array);
            oos.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
