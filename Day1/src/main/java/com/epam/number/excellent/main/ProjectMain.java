package com.epam.number.excellent.main;

import com.epam.number.excellent.report.NumberReport;
import com.epam.number.excellent.service.NumberService;
import com.epam.number.excellent.entity.Number;

public class ProjectMain {
    public static void main(String[] args) {
        Number number = new Number(28);
        NumberService service = new NumberService();
        int divisorsSum = service.findDivisorsSum(number);
        boolean result = service.divisorsSumEqualsNumber(divisorsSum, number);
        NumberReport reporter = new NumberReport();
        reporter.reportNumber(result);
    }
}
