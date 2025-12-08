package by.dvn.firsttask;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.factory.CustomIntArrayFactory;
import by.dvn.firsttask.factory.impl.CustomIntArrayFactoryImpl;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.observer.CustomIntArrayObserver;
import by.dvn.firsttask.observer.impl.CustomIntArrayObserverImpl;
import by.dvn.firsttask.parser.ParserStringToArray;
import by.dvn.firsttask.parser.impl.ParserStringToArrayImpl;
import by.dvn.firsttask.readfromfile.ReaderCustomArray;
import by.dvn.firsttask.readfromfile.impl.ReaderCustomArrayImpl;
import by.dvn.firsttask.repository.CustomIntArrayRepository;
import by.dvn.firsttask.repository.impl.CustomIntArrayRepositoryImpl;
import by.dvn.firsttask.validator.ArrayValidator;
import by.dvn.firsttask.validator.impl.ArrayValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    private static final Logger log = LogManager.getLogger();
    private static final String FILE_NAME = "array.txt";

    public static void main(String[] args) throws CustomArrayException {

        CustomIntArrayRepository repository = new CustomIntArrayRepositoryImpl();

        CustomIntArrayObserver observer = new CustomIntArrayObserverImpl();
        CustomIntArray.addCustomIntArrayObserver(observer);

        ReaderCustomArray readArr = new ReaderCustomArrayImpl();
        List<String> arraysList = readArr.readFileToList(FILE_NAME);

        ParserStringToArray parser = new ParserStringToArrayImpl();
        ArrayValidator chekArray = new ArrayValidatorImpl();

        for (String element : arraysList) {
            int[] intArray = parser.parseStringToIntArray(element);

            if (chekArray.checkArraySize(intArray)) {
                CustomIntArrayFactory arrayFactory = new CustomIntArrayFactoryImpl();
                CustomIntArray createdEntity = arrayFactory.createArray(intArray);
                repository.save(createdEntity);
            }
        }
    }
}