package by.dvn.firsttask.parser.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.parser.ParseStringToArray;
import by.dvn.firsttask.validation.CheckNumber;
import by.dvn.firsttask.validation.impl.CheckNumberImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseStringToArrayImpl implements ParseStringToArray {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);
    private static final String REGEX = "\\D";
    private static final String SEPARATOR = "[ \\.,!;-]";

    @Override
    public int[] parseStringToIntArray(String literal) {

        List<Integer> arrList = new ArrayList<Integer>();

        // Divide line by the expected numbers
        Pattern pattern = Pattern.compile(SEPARATOR);
        String[] stringArr = pattern.split(literal);

        CheckNumber checker = new CheckNumberImpl();

        int count = 0;
        for (String element : stringArr) {
           if (checker.checkElement(element)) {
                arrList.add(Integer.parseInt(element));
            }
            count++;
        }

        int[] intArray = new int[count];
        for (int i = 0; i < count; i++) {
            intArray[i] = arrList.get(i);
        }

        return intArray;

    }

}
