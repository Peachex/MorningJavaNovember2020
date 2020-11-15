package com.epam.number.even.service;

import com.epam.number.even.entity.Number;

public class NumberService {
    public boolean checkNumberForEvenness(Number... numbers) {
        int evenNumbersAmount = 0;
        for (Number number : numbers) {
            if (number.getValue() % 2 == 0) {
                evenNumbersAmount++;
            }
        }
        return (evenNumbersAmount > 1);
    }
}