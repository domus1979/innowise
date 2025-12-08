package by.dvn.firsttask.validator.impl;

import by.dvn.firsttask.validator.NumberValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidatorImpl implements NumberValidator {
    private static final Logger log = LogManager.getLogger();
    private static final String NUMBER_REGEX = "^-?\\d+$";

    @Override
    public boolean checkElement(String numberString) {

        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(numberString);
        return matcher.matches();

    }
}
