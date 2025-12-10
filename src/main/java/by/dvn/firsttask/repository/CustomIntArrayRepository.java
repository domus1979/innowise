package by.dvn.firsttask.repository;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.specification.CustomIntArraySpecification;

import java.util.Comparator;
import java.util.List;

public interface CustomIntArrayRepository {
    void save(CustomIntArray customIntArray);
    void remove(CustomIntArray customIntArray);
    List<CustomIntArray> find(CustomIntArraySpecification specification);
    List<CustomIntArray> sort(Comparator<CustomIntArray> comparator);
}
