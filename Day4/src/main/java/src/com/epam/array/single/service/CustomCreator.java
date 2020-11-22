package src.com.epam.array.single.service;

public class CustomCreator {
    public int[] createFibonacciNumbersArray(int maxElement) {
        int current = 1;
        int previous = 0;
        int count = 2;
        while (current < maxElement) {
            current += previous;
            previous = current - previous;
            count++;
        }
        int[] result = new int[count];
        current = 1;
        previous = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = previous;
            current += previous;
            previous = current - previous;
        }
        return result;
    }

    public int[] createDigitsArray(int number) {
        int size = (int) Math.log10(number) + 1;
        int length = (int) (Math.pow(10, (int) Math.log10(number)));
        int[] digits = new int[size];
        int count = 0;
        while (number != 0) {
            digits[count++] = number / length;
            number %= length;
            length /= 10;
        }
        return digits;
    }
}
