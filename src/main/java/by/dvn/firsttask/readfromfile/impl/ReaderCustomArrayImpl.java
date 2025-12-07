package by.dvn.firsttask.readfromfile.impl;

import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.readfromfile.ReaderCustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReaderCustomArrayImpl implements ReaderCustomArray {
    private static final Logger log = LogManager.getLogger();
    private static final String DIRECTORY = "data/";

    @Override
    public List<String> readFileToList(String fileName) throws CustomArrayException {
        List<String> lines;

        if (fileName == null || fileName.isBlank() || Files.notExists(Path.of(DIRECTORY + fileName))) {
            throw new CustomArrayException("File " + DIRECTORY + fileName + " not exist.");
        }

        try {
            lines = Files.readAllLines(Paths.get(DIRECTORY + fileName));
        } catch (IOException ex) {
            throw new CustomArrayException("Can`t read file: " + DIRECTORY + fileName);
        }

        log.info("Read array file.");
        return lines;

    }



}
