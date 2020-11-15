package com.epam.number.excellent.service;

import com.epam.number.excellent.entity.Number;

public class NumberService {
    public int findDivisorsSum(Number number) {
        int sum = 0;
        for (int i = 1; i <= number.getValue() / 2; i++) {
            if (number.getValue() % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public boolean divisorsSumEqualsNumber(int divisorsSum, Number number) {
        return (divisorsSum == number.getValue());
    }
}
