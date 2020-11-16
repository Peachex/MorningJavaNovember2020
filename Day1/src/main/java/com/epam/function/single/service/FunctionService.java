package com.epam.function.single.service;

import com.epam.function.single.entity.Function;

public class FunctionService {
    public double findFunctionByArg(double arg) {
        double result = 0;
        if (arg >= 3) {
            result = -Math.pow(arg, 2) + 3 * arg + 9;
        } else {
            try {
                arg = 1 / (Math.pow(arg, 3) - 6);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        return result;
    }
}