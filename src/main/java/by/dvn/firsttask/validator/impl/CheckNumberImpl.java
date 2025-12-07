package by.dvn.firsttask.validator.impl;

import by.dvn.firsttask.validator.CheckNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumberImpl implements CheckNumber {
    private static final Logger log = LogManager.getLogger();
    private static final String NUMBER_REGEX = "^-?\\d+$";

    @Override
    public boolean checkElement(String element) {

        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(element);
        return matcher.matches();

    }
}
