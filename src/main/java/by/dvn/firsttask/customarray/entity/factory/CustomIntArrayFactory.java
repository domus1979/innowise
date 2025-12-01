package by.dvn.firsttask.customarray.entity.factory;

import by.dvn.firsttask.customarray.entity.CustomIntArray;

public interface CustomIntArrayFactory {
    public abstract CustomIntArray createArray();
    public abstract CustomIntArray createArray(int size);
    public abstract CustomIntArray createArray(int[] arr);
}
