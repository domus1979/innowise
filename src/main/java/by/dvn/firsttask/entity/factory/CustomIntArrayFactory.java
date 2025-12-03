package by.dvn.firsttask.entity.factory;

import by.dvn.firsttask.entity.CustomIntArray;

public interface CustomIntArrayFactory {
    CustomIntArray createArray();
    CustomIntArray createArray(int size);
    CustomIntArray createArray(int[] arr);
}
