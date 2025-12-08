package by.dvn.firsttask.comparator;

import by.dvn.firsttask.entity.CustomIntArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class CustomIntArrayNumberOfElemetsComparator implements Comparator<CustomIntArray> {
    private static final Logger log = LogManager.getLogger();

    @Override
    public int compare(CustomIntArray o1, CustomIntArray o2) {
        int result;
        if (o1.getArray().length > 0 && o2.getArray().length > 0) {
            result = o1.getArray()[0] - o2.getArray()[0];
        } else {
            log.error("Can`t sort arrays with zero length!");
            result = 0;
        }
        return result;
    }
}
