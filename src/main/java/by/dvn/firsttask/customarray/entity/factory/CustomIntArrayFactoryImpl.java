package by.dvn.firsttask.customarray.entity.factory;

import by.dvn.firsttask.customarray.entity.CustomIntArray;

public class CustomIntArrayFactoryImpl implements CustomIntArrayFactory{
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
