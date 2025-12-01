package by.dvn.firsttask;

import by.dvn.firsttask.customarray.entity.CustomIntArray;
import by.dvn.firsttask.customarray.entity.factory.CustomIntArrayFactory;
import by.dvn.firsttask.customarray.entity.factory.CustomIntArrayFactoryImpl;
import by.dvn.firsttask.customarray.exception.CustomArrayException;
import by.dvn.firsttask.customarray.servise.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);

    public static void main(String[] args) throws CustomArrayException {

        int[] primeArr = {10,1,12,7,4};

        CustomIntArrayFactory arrayFactory = new CustomIntArrayFactoryImpl();
        CustomIntArray arr = arrayFactory.createArray(primeArr);

        CustomArrayService serv = new CustomArrayServiceImpl();
        int[] tempArr = serv.bubbleSort(arr);
//        CustomArrayConvertation frrConv = new CustomArrayConvertationImpl();
//        ReadCustomArray readArr = new ReadCustomArrayImpl();
//        List<String> listForArray = readArr.readFileToList("array.txt");
//        if (listForArray.size() != 0) {
//            frrConv.convertStringToInt(listForArray.get(0));
//        }
        log.info(arr.toString());
    }
}