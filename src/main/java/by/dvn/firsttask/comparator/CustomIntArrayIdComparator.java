package by.dvn.firsttask.comparator;

import by.dvn.firsttask.entity.CustomIntArray;

import java.util.Comparator;

public class CustomIntArrayIdComparator implements Comparator<CustomIntArray> {

    @Override
    public int compare(CustomIntArray o1, CustomIntArray o2) {
        return (int) (o1.getId() - o2.getId());
    }
}
