package by.dvn.firsttask.readfromfile;

import by.dvn.firsttask.exception.CustomArrayException;

import java.util.List;

public interface ReaderCustomArray {
    List<String> readFileToList(String fileName) throws CustomArrayException;
}
