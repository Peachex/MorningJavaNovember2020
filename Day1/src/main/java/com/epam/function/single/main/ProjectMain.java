package com.epam.function.single.main;

import com.epam.function.single.entity.*;
import com.epam.function.single.report.MathFunctionReport;
import com.epam.function.single.service.MathFunctionService;

public class ProjectMain {
    public static void main(String[] args) {
        int argumentValue = 3;
        Argument argument = new Argument(argumentValue);
        MathFunctionService service = new MathFunctionService();
        MathFunction function = new MathFunction(service.findFunctionByArg(argument.getValue()));
        MathFunctionReport reporter = new MathFunctionReport();
        reporter.reportFunction(function, argument);
    }
}
