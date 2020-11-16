package com.epam.function.single.service;

import com.epam.function.single.entity.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FunctionServiceTest {
    @Test
    public void findFunctionByArg() {
        double expected = 9;
        double argumentValue = 3;
        Argument argument = new Argument(argumentValue);
        FunctionService service = new FunctionService();
        Function function = new Function(service.findFunctionByArg(argument.getValue()));
        double actual = function.getValue();
        assertEquals(actual, expected);
    }
}
