package by.dvn.firsttask.servise;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.exception.CustomArrayException;

public interface CustomArrayService {
    int max(CustomIntArray arr) throws CustomArrayException;
    int min(CustomIntArray arr) throws CustomArrayException;
    int sum(CustomIntArray arr) throws CustomArrayException;
    int[] bubbleSort(CustomIntArray arr) throws CustomArrayException;
    int[] quickSort(CustomIntArray arr) throws CustomArrayException;
}
