package com.epam.function.table.report;

import com.epam.function.table.entity.*;

public class MathFunctionReport {
    public void reportFunction(MathFunction[] functions, Argument[] arguments) {
        for (int i = 0; i < functions.length; i++) {
            System.out.println(arguments[i].getValue() + "\t\t" + functions[i].getValue());
        }
    }
}
