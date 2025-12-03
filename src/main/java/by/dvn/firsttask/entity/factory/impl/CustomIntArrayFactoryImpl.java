package by.dvn.firsttask.entity.factory.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.entity.factory.CustomIntArrayFactory;

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
    public CustomIntArray createArray(int[] arr) {
        return new CustomIntArray(arr);
    }
}
