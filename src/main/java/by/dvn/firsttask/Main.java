package by.dvn.firsttask;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.entity.factory.CustomIntArrayFactory;
import by.dvn.firsttask.entity.factory.impl.CustomIntArrayFactoryImpl;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.parser.ParseStringToArray;
import by.dvn.firsttask.parser.impl.ParseStringToArrayImpl;
import by.dvn.firsttask.readfromfile.ReadCustomArray;
import by.dvn.firsttask.readfromfile.impl.ReadCustomArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);

    public static void main(String[] args) throws CustomArrayException {

//        int[] primeArr = {10,1,12,7,4};
//        CustomIntArrayFactory arrayFactory = new CustomIntArrayFactoryImpl();
//        CustomIntArray arr = arrayFactory.createArray(primeArr);

//        CustomArrayService serv = new CustomArrayServiceImpl();
//        int[] tempArr = serv.bubbleSort(arr);

        ReadCustomArray readArr = new ReadCustomArrayImpl();
        List<String> arraysList = readArr.readFileToList("array.txt");
        ParseStringToArray parser = new ParseStringToArrayImpl();
        for (String element : arraysList) {
            int[] intArray = parser.parseStringToIntArray(element);
            log.info(intArray.toString());
        }
    }
}