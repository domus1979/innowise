package by.dvn.firsttask;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.entity.factory.CustomIntArrayFactory;
import by.dvn.firsttask.entity.factory.impl.CustomIntArrayFactoryImpl;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.parser.ParseStringToArray;
import by.dvn.firsttask.parser.impl.ParseStringToArrayImpl;
import by.dvn.firsttask.readfromfile.ReadCustomArray;
import by.dvn.firsttask.readfromfile.impl.ReadCustomArrayImpl;
import by.dvn.firsttask.validation.CheckArray;
import by.dvn.firsttask.validation.impl.CheckArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);

    public static void main(String[] args) throws CustomArrayException {

        ReadCustomArray readArr = new ReadCustomArrayImpl();
        List<String> arraysList = readArr.readFileToList("array.txt");
        ParseStringToArray parser = new ParseStringToArrayImpl();
        CheckArray chekArray = new CheckArrayImpl();
        for (String element : arraysList) {
            int[] intArray = parser.parseStringToIntArray(element);

            if (chekArray.checkArraySize(intArray)) {
                CustomIntArrayFactory arrayFactory = new CustomIntArrayFactoryImpl();
                CustomIntArray createdEntity = arrayFactory.createArray(intArray);
                log.info(new StringBuilder().append("Create new object: ")
                        .append(createdEntity.toString()).toString());
            }
        }
    }
}