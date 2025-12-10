package by.dvn.firsttask.entity;

import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.observer.CustomIntArrayObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomIntArray implements CustomIntArrayObserver {
    private static final Logger log = LogManager.getLogger();
    private static long counter = 0;
    private static CustomIntArrayObserver customIntArrayObserver;
    private long id = 0;
    private int[] array;

    public CustomIntArray() {
    }

    public CustomIntArray(int size) {
        this.id = ++counter;
        this.array = new int[size];
    }

    public CustomIntArray(int[] array) throws CustomArrayException {
        this.id = ++counter;
        this.array = Arrays.copyOf(array, array.length);
        updateWarehouseData(this);
    }

    public static void addCustomIntArrayObserver(CustomIntArrayObserver customIntArrayObserver) {
        if (customIntArrayObserver != null) {
            CustomIntArray.customIntArrayObserver = customIntArrayObserver;
        }
    }

    public static void removeCustomIntArrayObserver() {
        customIntArrayObserver = null;
    }

    public long getId() {
        return id;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) throws CustomArrayException {
        this.array = Arrays.copyOf(array, array.length);
        updateWarehouseData(this);
    }

    @Override
    public void updateWarehouseData(CustomIntArray customIntArray) throws CustomArrayException {
        if (customIntArrayObserver != null) {
            customIntArrayObserver.updateWarehouseData(customIntArray);
            log.debug("For CustomIntArray with id: " + id + " put data to warehouse.");
        }
    }


    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("CustomIntArray: {");
        for (int i = 0; i < this.array.length; i++) {
            if (i == 0) {
                text.append(array[i]);
            } else {
                text.append("; ").append(array[i]);
            }
        }
        text.append("}");
        return String.valueOf(text);
    }


}
