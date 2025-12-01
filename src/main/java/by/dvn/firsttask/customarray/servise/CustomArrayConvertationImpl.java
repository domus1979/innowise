package by.dvn.firsttask.customarray.servise;

import by.dvn.firsttask.customarray.entity.CustomIntArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomArrayConvertationImpl implements CustomArrayConvertation{
    private static final String REGEX = "\\b\\d+\\b";
    private static final String SEPARATOR = ";";
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);

    public int[] convertStringToArray(String arrayString) {
        String strArr[] = arrayString.split(SEPARATOR);
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return new int[0];
    }

    public int convertStringToInt(String literal) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(literal);
        while (matcher.find()) {
            System.out.println(literal.substring(matcher.start(), matcher.end()));
        }

        return 0;
    }


}
