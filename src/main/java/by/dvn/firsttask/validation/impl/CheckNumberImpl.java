package by.dvn.firsttask.validation.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.validation.CheckNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumberImpl implements CheckNumber {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);
    private static final String REGEX = "\\D";

    @Override
    public boolean checkElement(String element) {

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(element);
        if (matcher.matches()) {
            log.info("Element " + String.valueOf(element) + " not number.");
            return false;
        }
        return true;

    }
}
