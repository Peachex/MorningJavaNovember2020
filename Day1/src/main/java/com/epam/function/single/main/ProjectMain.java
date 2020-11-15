package com.epam.function.single.main;

import com.epam.function.single.entity.Function;
import com.epam.function.single.report.FunctionReport;
import com.epam.function.single.service.FunctionService;

public class ProjectMain {
    public static void main(String[] args) {
        FunctionService service = new FunctionService();
        int argument = 3;
        Function function = service.findFunctionByArg(argument);
        FunctionReport reporter = new FunctionReport();
        reporter.reportFunction(function);
    }
}
