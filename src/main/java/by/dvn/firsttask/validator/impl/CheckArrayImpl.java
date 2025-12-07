package by.dvn.firsttask.validator.impl;

import by.dvn.firsttask.validator.CheckArray;

public class CheckArrayImpl implements CheckArray {

    @Override
    public boolean checkArraySize(int size) {
        boolean result = size > 0;
        return result;
    }

    @Override
    public boolean checkArraySize(int[] array) {
        boolean result = array.length > 0;
        return result;
    }
}
