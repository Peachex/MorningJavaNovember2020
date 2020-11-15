package com.epam.function.single.report;

import com.epam.function.single.entity.Function;

public class FunctionReport {
    public void reportFunction(Function function) {
        System.out.println("F(x) = " + function.getValue() + ", x = " + function.getArg());
    }
}