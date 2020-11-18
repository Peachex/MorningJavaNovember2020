package com.epam.function.single.service;

import com.epam.function.single.entity.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathFunctionServiceTest {
    @Test
    public void findFunctionByArg() {
        double expected = 9;
        double argumentValue = 3;
        Argument argument = new Argument(argumentValue);
        MathFunctionService service = new MathFunctionService();
        MathFunction function = new MathFunction(service.findFunctionByArg(argument.getValue()));
        double actual = function.getValue();
        assertEquals(actual, expected);
    }
}
