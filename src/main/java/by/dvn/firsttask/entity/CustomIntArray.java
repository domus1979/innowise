package by.dvn.firsttask.entity;

import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.observer.CustomIntArrayObserver;
import by.dvn.firsttask.observer.impl.CustomIntArrayObserverImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomIntArray implements CustomIntArrayObserver {
    private static final Logger log = LogManager.getLogger();
    private static long id = 0;
    private static CustomIntArrayObserver customIntArrayObserver = new CustomIntArrayObserverImpl();
    private int[] array;

    public CustomIntArray() {
    }

    public CustomIntArray(int size) {
        ++id;
        this.array = new int[size];
    }

    public CustomIntArray(int[] array) {
        ++id;
        this.array = Arrays.copyOf(array, array.length);
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

    public void addCustomIntArrayObserver(CustomIntArrayObserver customIntArrayObserver) {
        if (customIntArrayObserver != null) {
            this.customIntArrayObserver = customIntArrayObserver;
        }
    }

    public void removeCustomIntArrayObserver() {
        this.customIntArrayObserver = null;
    }

    @Override
    public void updateWarehouseData(CustomIntArray customIntArray) throws CustomArrayException {
        customIntArrayObserver.updateWarehouseData(customIntArray);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomIntArray that = (CustomIntArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("CustomIntArray: {");
        for (int i = 0; i < this.array.length; i++) {
            if (i == 0) {
                text.append(array[i]);
            }
            else {
                text.append("; ").append(array[i]);
            }
        }
        text.append("}");
        return String.valueOf(text);
    }


}
