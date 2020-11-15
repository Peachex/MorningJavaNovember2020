package com.epam.function.single.service;

import com.epam.function.single.entity.Function;

public class FunctionService {
    public Function findFunctionByArg(double arg) {
        double functionValue = 0;
        if (arg >= 3) {
            functionValue = -Math.pow(arg, 2) + 3 * arg + 9;
        } else {
            try {
                arg = 1 / (Math.pow(arg, 3) - 6);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        return new Function(functionValue, arg);
    }
}