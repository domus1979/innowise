package by.dvn.firsttask.customarray.servise;

import by.dvn.firsttask.customarray.entity.CustomIntArray;
import by.dvn.firsttask.customarray.exception.CustomArrayException;

public interface CustomArrayService {
    public int max(CustomIntArray arr) throws CustomArrayException;
    public int min(CustomIntArray arr) throws CustomArrayException;
    public int sum(CustomIntArray arr) throws CustomArrayException;
    public int[] bubbleSort(CustomIntArray arr) throws CustomArrayException;
    public int[] quickSort(CustomIntArray arr) throws CustomArrayException;
}
