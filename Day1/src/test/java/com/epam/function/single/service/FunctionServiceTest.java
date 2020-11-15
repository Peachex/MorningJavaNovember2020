package com.epam.function.single.service;

import com.epam.function.single.entity.Function;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FunctionServiceTest {
    @Test
    public void findFunctionByArg() {
        FunctionService service = new FunctionService();
        Function function = service.findFunctionByArg(3);
        double expected = 9;
        double actual = function.getValue();
        assertEquals(actual, expected);
    }
}
