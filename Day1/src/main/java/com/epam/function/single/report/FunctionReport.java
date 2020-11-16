package com.epam.function.single.report;

import com.epam.function.single.entity.*;

public class FunctionReport {
    public void reportFunction(Function function, Argument argument) {
        System.out.println("F(x) = " + function.getValue() + ", x = " + argument.getValue());
    }
}