package by.dvn.firsttask.factory.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.factory.CustomIntArrayFactory;

public class CustomIntArrayFactoryImpl implements CustomIntArrayFactory {
    @Override
    public CustomIntArray createArray() {
        return new CustomIntArray();
    }

    @Override
    public CustomIntArray createArray(int size) {
        return new CustomIntArray(size);
    }

    @Override
    public CustomIntArray createArray(int[] array) {
        return new CustomIntArray(array);
    }
}
