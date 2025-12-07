package by.dvn.firsttask;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.factory.CustomIntArrayFactory;
import by.dvn.firsttask.factory.impl.CustomIntArrayFactoryImpl;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.parser.ParseStringToArray;
import by.dvn.firsttask.parser.impl.ParseStringToArrayImpl;
import by.dvn.firsttask.readfromfile.ReadCustomArray;
import by.dvn.firsttask.readfromfile.impl.ReadCustomArrayImpl;
import by.dvn.firsttask.validator.CheckArray;
import by.dvn.firsttask.validator.impl.CheckArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    private static final Logger log = LogManager.getLogger();
    private static final String FILE_NAME = "array.txt";

    public static void main(String[] args) throws CustomArrayException {

        ReadCustomArray readArr = new ReadCustomArrayImpl();
        List<String> arraysList = readArr.readFileToList(FILE_NAME);
        ParseStringToArray parser = new ParseStringToArrayImpl();
        CheckArray chekArray = new CheckArrayImpl();
        for (String element : arraysList) {
            int[] intArray = parser.parseStringToIntArray(element);

            if (chekArray.checkArraySize(intArray)) {
                CustomIntArrayFactory arrayFactory = new CustomIntArrayFactoryImpl();
                CustomIntArray createdEntity = arrayFactory.createArray(intArray);
                log.info("Create new object: " +
                        createdEntity.toString());
            }
        }
    }
}