package com.epam.function.single.report;

import com.epam.function.single.entity.*;

public class MathFunctionReport {
    public void reportFunction(MathFunction function, Argument argument) {
        System.out.println("F(x) = " + function.getValue() + ", x = " + argument.getValue());
    }
}