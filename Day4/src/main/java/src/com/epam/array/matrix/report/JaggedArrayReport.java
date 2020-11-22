package src.com.epam.array.matrix.report;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import src.com.epam.array.matrix.entity.JaggedArray;

public class JaggedArrayReport {
    private static final Logger logger = LogManager.getLogger();

    public void reportArray(JaggedArray jaggedArray, String message) {
        logger.info(message + "\n");
        for (int[] i : jaggedArray.getMatrix()) {
            for (int j : i) {
                logger.debug(j + "\t");
            }
            logger.debug("\n");
        }
        logger.debug("\n");
    }
}
