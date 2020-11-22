package src.com.epam.array.matrix.main;

import src.com.epam.array.matrix.entity.JaggedArray;
import src.com.epam.array.matrix.report.JaggedArrayReport;
import src.com.epam.array.matrix.service.CalculateService;
import src.com.epam.array.matrix.service.ParameterArrayCreator;
import src.com.epam.array.matrix.service.SortService;

public class ProjectMain {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {5, 4, 3, 2, 0},
                {10, 20, 30, 40, 50, 60, 70},
                {90},
        };
        JaggedArray jaggedArray = new JaggedArray(matrix);
        JaggedArrayReport reporter = new JaggedArrayReport();

        String message1 = "Jagged array:";
        reporter.reportArray(jaggedArray, message1);

        SortService sorter = new SortService();
        ParameterArrayCreator creator = new ParameterArrayCreator();
        CalculateService calculator = new CalculateService();

        sorter.sortRowsByRowsSum(jaggedArray, creator, calculator, false);
        String message2 = "Jagged array, sorted by rows sum:";
        reporter.reportArray(jaggedArray, message2);

        sorter.sortRowsByMaxElement(jaggedArray, creator, calculator, false);
        String message3 = "Jagged array, sorted by rows' max element:";
        reporter.reportArray(jaggedArray, message3);

        sorter.sortRowsByMinElement(jaggedArray, creator, calculator, false);
        String message4 = "Jagged array, sorted by rows' min element:";
        reporter.reportArray(jaggedArray, message4);
    }
}
