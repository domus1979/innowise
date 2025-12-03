package by.dvn.firsttask.validation.impl;

import by.dvn.firsttask.validation.CheckArray;

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
