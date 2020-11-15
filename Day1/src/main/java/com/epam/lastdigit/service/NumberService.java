package com.epam.lastdigit.service;

import com.epam.lastdigit.entity.Number;

public class NumberService {
    public Number findLastDigit(Number number) {
        int count = (int) Math.pow(10, (int) Math.log10(number.getValue()));
        int value = number.getValue();

        while (value > 9) {
            value = value % count;
            count /= 10;
        }
        return new Number(value);
    }

    public Number findLastDigitOfSquare(Number lastDigit) {
        int result = 0;

        if (lastDigit.getValue() == 1 || lastDigit.getValue() == 9) {
            result = 1;
        } else {
            if (lastDigit.getValue() == 2 || lastDigit.getValue() == 8) {
                result = 4;
            } else {
                if (lastDigit.getValue() == 3 || lastDigit.getValue() == 7) {
                    result = 9;
                } else {
                    if (lastDigit.getValue() == 4 || lastDigit.getValue() == 6) {
                        result = 6;
                    } else {
                        result = 5;
                    }
                }
            }
        }
        return new Number(result);
    }
}
