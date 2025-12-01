package by.dvn.firsttask.customarray.servise;

import by.dvn.firsttask.customarray.entity.CustomIntArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadCustomArrayImpl implements ReadCustomArray{
    private static final Logger log = LogManager.getLogger(CustomIntArray.class);
    private static final String DIRECTORY = "/data/";

    @Override
    public List<String> readFileToList(String fileName) {
        List<String> result;

        try {
            List<String> lines = Files.readAllLines(Paths.get(DIRECTORY + fileName));
        } catch (IOException ex) {
            log.error(ex.getMessage());
            ex.printStackTrace();
        }

        return List.of();
    }

    @Override
    public int[] convertStringToArray(String arrayString) {

        String strArr[] = arrayString.split(";");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {

            numArr[i] = Integer.parseInt(strArr[i]);
            // System.out.println(numArr[i]);
        }
        return new int[0];
    }


}
