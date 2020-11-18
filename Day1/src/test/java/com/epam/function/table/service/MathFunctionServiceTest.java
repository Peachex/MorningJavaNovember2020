package com.epam.function.table.service;

import com.epam.function.table.entity.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathFunctionServiceTest {
    @Test
    public void findFunctionValueTest() {
        double argumentValue = 1;
        Argument argument = new Argument(argumentValue);
        double expected = Math.tan(argument.getValue());
        MathFunctionService service = new MathFunctionService();
        MathFunction actual = new MathFunction(service.findFunctionValue(argument));
        assertEquals(actual.getValue(), expected);
    }

    @Test
    public void fillArgumentsArrayTest() {
        double a = 1;
        double h = 1;
        int argumentsAmount = 3;
        Argument[] expected = new Argument[]{new Argument(1), new Argument(2), new Argument(3)};
        MathFunctionService service = new MathFunctionService();
        Argument[] actual = new Argument[argumentsAmount];
        service.fillArgumentsArray(actual, a, h);
        assertEquals(actual, expected);
    }

    @Test
    public void fillFunctionsArrayTest() {
        int argumentsAmount = 3;
        Argument[] arguments = new Argument[]{new Argument(1), new Argument(2), new Argument(3)};
        MathFunction[] expected = new MathFunction[]{
                new MathFunction(Math.tan(arguments[0].getValue())),
                new MathFunction(Math.tan(arguments[1].getValue())),
                new MathFunction(Math.tan(arguments[2].getValue()))
        };
        MathFunction[] actual = new MathFunction[argumentsAmount];
        MathFunctionService service = new MathFunctionService();
        service.fillFunctionsArray(actual, arguments);
        assertEquals(actual, expected);
    }

    @Test
    public void findArgumentsAmountTest() {
        int expected = 9;
        double a = 1;
        double b = 5;
        double h = 0.5;
        MathFunctionService service = new MathFunctionService();
        int actual = service.findArgumentsAmount(a, b, h);
        assertEquals(actual, expected);
    }
}
