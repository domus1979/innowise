package by.dvn.firsttask.entity.factory;

import by.dvn.firsttask.entity.CustomIntArray;

public interface CustomIntArrayFactory {
    public abstract CustomIntArray createArray();
    public abstract CustomIntArray createArray(int size);
    public abstract CustomIntArray createArray(int[] arr);
}
