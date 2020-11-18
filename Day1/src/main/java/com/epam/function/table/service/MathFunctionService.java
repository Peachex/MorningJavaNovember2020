package com.epam.function.table.service;

import com.epam.function.table.entity.*;

public class MathFunctionService {
    public double findFunctionValue(Argument argument) {
        double result = Math.tan(argument.getValue());
        return result;
    }

    public void fillArgumentsArray(Argument[] arguments, double a, double h) {
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = new Argument(a);
            a += h;
        }
    }

    public void fillFunctionsArray(MathFunction[] functions, Argument[] arguments) {
        for (int i = 0; i < functions.length; i++) {
            functions[i] = new MathFunction(findFunctionValue(arguments[i]));
        }
    }

    public int findArgumentsAmount(double a, double b, double h) {
        int result = 0;
        if (a < 0) {
            result = (int) (Math.abs(Math.abs(a) + Math.abs(b)) / h) + 1;
        } else {
            result = (int) (Math.abs(Math.abs(a) - Math.abs(b)) / h) + 1;
        }
        return result;
    }
}
