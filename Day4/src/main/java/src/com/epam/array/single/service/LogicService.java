package src.com.epam.array.single.service;

public class LogicService {
    public boolean checkNumberForSimplicity(int number) {
        if (number == 0) {
            return false;
        }
        number = Math.abs(number);
        int i = 2;
        while (i <= number / 2) {
            if (number % i++ == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkNumberForFibonacci(int number, int[] fibonacciNumbers) {
        int count = 0;
        while (count < fibonacciNumbers.length && number >= fibonacciNumbers[count]) {
            if (number == fibonacciNumbers[count++]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkNumberForDifferentDigits(int[] digits) {
        int i = 0;
        while (i < digits.length - 1) {
            int j = i + 1;
            while (j < digits.length) {
                if (digits[i] == digits[j++]) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}
