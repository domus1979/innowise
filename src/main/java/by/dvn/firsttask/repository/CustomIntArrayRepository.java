package by.dvn.firsttask.repository;

import by.dvn.firsttask.entity.CustomIntArray;

import java.util.Comparator;
import java.util.List;

public interface CustomIntArrayRepository {
    void save(CustomIntArray customIntArray);
    void remove(CustomIntArray customIntArray);
    List<CustomIntArray> find();
    List<CustomIntArray> sort(Comparator<CustomIntArray> comparator);
}
