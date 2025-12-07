package by.dvn.firsttask.entity;

import by.dvn.firsttask.validator.ArrayValidator;
import by.dvn.firsttask.validator.impl.ArrayValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomIntArray {
    private static final Logger log = LogManager.getLogger();
    private int[] arr;

    public CustomIntArray() {
    }

    public CustomIntArray(int size) {
        ArrayValidator arrayValidator = new ArrayValidatorImpl();
        if (arrayValidator.checkArraySize(size)) {
            this.arr = new int[size];
        }
        else {
            this.arr = new int[0];
            log.error("The array size cannot be less than or equal to 0");
//            throw new CustomArrayException("The array size cannot be less than or equal to 0");
        }
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomIntArray that = (CustomIntArray) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
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
