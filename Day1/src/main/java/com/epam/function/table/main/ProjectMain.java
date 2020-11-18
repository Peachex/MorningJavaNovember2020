package com.epam.function.table.main;

import com.epam.function.table.entity.*;
import com.epam.function.table.report.*;
import com.epam.function.table.service.*;

public class ProjectMain {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double h = 0.5;

        MathFunctionService service = new MathFunctionService();
        int argumentsAmount = service.findArgumentsAmount(a, b, h);

        Argument[] arguments = new Argument[argumentsAmount];
        service.fillArgumentsArray(arguments, a, h);

        MathFunction[] functions = new MathFunction[argumentsAmount];
        service.fillFunctionsArray(functions, arguments);

        MathFunctionReport reporter = new MathFunctionReport();
        reporter.reportFunction(functions, arguments);
    }
}
