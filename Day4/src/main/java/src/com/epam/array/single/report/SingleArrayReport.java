package src.com.epam.array.single.report;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import src.com.epam.array.single.entity.SingleArray;

public class SingleArrayReport {
    private static final Logger logger = LogManager.getLogger();

    public void reportArray(SingleArray array, String message) {
        logger.info(message);
        for (int i : array.getArray()) {
            logger.debug(i + "\t");
        }
        logger.debug("\n");
    }

    public void reportBinarySearchResult(SingleArray array, int key, boolean condition) {
        logger.info(key + (condition ? " - was found" : " - wasn't found") + " in the array (  ");
        for (int i : array.getArray()) {
            logger.debug(i + "\t");
        }
        logger.debug(").\n");
    }

    public void reportElement(SingleArray array, int element, String message) {
        logger.info(message + element + " (  ");
        for (int i : array.getArray()) {
            logger.debug(i + "\t");
        }
        logger.debug(").\n");
    }
}
