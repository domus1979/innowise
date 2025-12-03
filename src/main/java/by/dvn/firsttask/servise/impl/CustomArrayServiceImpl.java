package by.dvn.firsttask.servise.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.servise.CustomArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayServiceImpl implements CustomArrayService {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);

    @Override
    public int max(CustomIntArray arr) throws CustomArrayException {
        int[] tempArr = arr.getArr();

        if (tempArr.length == 0) {
            throw new CustomArrayException("Can't determine max element. Massive is empty!");
        }

        int result = tempArr[0];
        for (int i = 1; i < tempArr.length; i++) {
            if (result < tempArr[i]) {
                result = tempArr[i];
            }
        }

        return result;
    }

    @Override
    public int min(CustomIntArray arr) throws CustomArrayException {
        int[] tempArr = arr.getArr();

        if (tempArr.length == 0) {
            throw new CustomArrayException("Can't determine min element. Massive is empty!");
        }

        int result = tempArr[0];
        for (int i = 1; i < tempArr.length; i++) {
            if (result > tempArr[i]) {
                result = tempArr[i];
            }
        }

        return result;
    }

    @Override
    public int sum(CustomIntArray arr) throws CustomArrayException {
        int[] tempArr = arr.getArr();

        if (tempArr.length == 0) {
            throw new CustomArrayException("Can't determine elements sum. Massive is empty!");
        }

        int result = 0;
        for (int j : tempArr) {
            result += j;
        }

        return result;
    }

    @Override
    public int[] bubbleSort(CustomIntArray arr) throws CustomArrayException {
        int[] tempArr = arr.getArr();

        if (tempArr.length == 0) {
            throw new CustomArrayException("Can't sort element. Massive is empty!");
        }

        int k;
        for (int i = 0; i < tempArr.length - 1; i++) {
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[i] > tempArr[j]) {
                    k = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = k;
                }
            }
        }

        return tempArr;
    }

    @Override
    public int[] quickSort(CustomIntArray arr) throws CustomArrayException {
        int[] tempArr = arr.getArr();

        if (tempArr.length == 0) {
            throw new CustomArrayException("Can't sort element. Massive is empty!");
        }

        quickSortAlg(tempArr, 0, tempArr.length - 1);

        return tempArr;
    }

    private void quickSortAlg(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);


            quickSortAlg(arr, low, pi - 1);
            quickSortAlg(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
