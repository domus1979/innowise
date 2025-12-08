package by.dvn.firsttask.observer;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.exception.CustomArrayException;

public interface CustomIntArrayObserver {
    void updateWarehouseData(CustomIntArray customIntArray) throws CustomArrayException;
}
