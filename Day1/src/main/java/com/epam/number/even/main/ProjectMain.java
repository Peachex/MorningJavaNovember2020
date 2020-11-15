package com.epam.number.even.main;

import com.epam.number.even.entity.Number;
import com.epam.number.even.report.NumberReport;
import com.epam.number.even.service.NumberService;

public class ProjectMain {
    public static void main(String[] args) {
        Number[] numbersArray = {new Number(2), new Number(4), new Number(5), new Number(7)};
        NumberService service = new NumberService();
        boolean result = service.checkNumberForEvenness(numbersArray);
        NumberReport reporter = new NumberReport();
        reporter.reportNumber(result);
    }
}
