package by.dvn.firsttask.readfromfile.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.readfromfile.ReadCustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomArrayImpl implements ReadCustomArray {
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);
    private static final String DIRECTORY = "data/";

    @Override
    public List<String> readFileToList(String fileName) throws CustomArrayException {
        List<String> lines = new ArrayList<>();

        if (fileName.strip().length() == 0) {
            throw new CustomArrayException("File name is empty.");
        }
        if (Files.notExists(Path.of(DIRECTORY + fileName))) {
            throw new CustomArrayException("File not exist.");
        }

        try {
            lines = Files.readAllLines(Paths.get(DIRECTORY + fileName));
        } catch (IOException ex) {
            throw new CustomArrayException(ex);
        }

        log.info("Read array file.");
        return lines;

    }



}
