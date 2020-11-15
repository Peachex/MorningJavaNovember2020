package com.epam.lastdigit.main;

import com.epam.lastdigit.entity.Number;
import com.epam.lastdigit.report.NumberReport;
import com.epam.lastdigit.service.NumberService;

public class ProjectMain {
    public static void main(String[] args) {
        Number number = new Number(123);
        NumberService service = new NumberService();
        Number result = service.findLastDigitOfSquare(service.findLastDigit(number));
        NumberReport reporter = new NumberReport();
        reporter.reportNumber(result, number);
    }
}
