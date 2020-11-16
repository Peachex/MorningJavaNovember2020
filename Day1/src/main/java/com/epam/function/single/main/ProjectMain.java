package com.epam.function.single.main;

import com.epam.function.single.entity.*;
import com.epam.function.single.report.FunctionReport;
import com.epam.function.single.service.FunctionService;

public class ProjectMain {
    public static void main(String[] args) {
        int argumentValue = 3;
        Argument argument = new Argument(argumentValue);
        FunctionService service = new FunctionService();
        Function function = new Function(service.findFunctionByArg(argument.getValue()));
        FunctionReport reporter = new FunctionReport();
        reporter.reportFunction(function, argument);
    }
}
