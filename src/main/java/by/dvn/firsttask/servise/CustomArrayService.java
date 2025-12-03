package by.dvn.firsttask.servise;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.exception.CustomArrayException;

public interface CustomArrayService {
    public int max(CustomIntArray arr) throws CustomArrayException;
    public int min(CustomIntArray arr) throws CustomArrayException;
    public int sum(CustomIntArray arr) throws CustomArrayException;
    public int[] bubbleSort(CustomIntArray arr) throws CustomArrayException;
    public int[] quickSort(CustomIntArray arr) throws CustomArrayException;
}
