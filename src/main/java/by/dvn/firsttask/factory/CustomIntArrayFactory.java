package by.dvn.firsttask.factory;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.exception.CustomArrayException;

public interface CustomIntArrayFactory {
    CustomIntArray createArray();
    CustomIntArray createArray(int size);
    CustomIntArray createArray(int[] arr) throws CustomArrayException;
}
