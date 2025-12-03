package by.dvn.firsttask.parser.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.parser.ParseStringToArray;
import by.dvn.firsttask.validation.CheckNumber;
import by.dvn.firsttask.validation.impl.CheckNumberImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ParseStringToArrayImpl implements ParseStringToArray {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);
    private static final String REGEX = "\\s*(\\.|,|;|\t)\\s*";

    @Override
    public int[] parseStringToIntArray(String literal) {

        if (literal.length() == 0) {
            return new int[0];
        }

        // Divide line by the expected numbers
        Pattern pattern = Pattern.compile(REGEX);
        String[] stringArr = pattern.split(literal);

        int count = 0;
        List<Integer> arrList = new ArrayList<>();
        CheckNumber checker = new CheckNumberImpl();
        for (String element : stringArr) {
           if (checker.checkElement(element)) {
                arrList.add(Integer.parseInt(element));
            }
            count++;
        }

        int[] intArray = new int[count];
        int i = 0;
        for (Integer el : arrList) {
            intArray[i++] = el;
        }

        log.info(new StringBuilder().append("Create new int array { ")
                .append(Arrays.toString(intArray))
                .append(" }").toString());

        return intArray;

    }

}
