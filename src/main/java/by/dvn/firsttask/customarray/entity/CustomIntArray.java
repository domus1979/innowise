package by.dvn.firsttask.customarray.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomIntArray {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);
    private int[] arr;

    public CustomIntArray() {
    }

    public CustomIntArray(int size) {
        this.arr = new int[size];
    }

    public CustomIntArray(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    private boolean checkSize(int index) {
        if (index >= 0 && index < this.arr.length) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("CustomIntArray: {");
        for (int i = 0; i < this.arr.length; i++) {
            if (i == 0) {
                text.append(arr[i]);
            }
            else {
                text.append("; ").append(arr[i]);
            }
        }
        text.append("}");
        return String.valueOf(text);
    }
}
