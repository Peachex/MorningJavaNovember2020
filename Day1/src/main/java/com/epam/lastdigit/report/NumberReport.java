package com.epam.lastdigit.report;

import com.epam.lastdigit.entity.Number;

public class NumberReport {
    public void reportNumber(Number lastDigit, Number number) {
        System.out.println(lastDigit.getValue() + " - last digit " + number.getValue() + "^2.");
    }
}
