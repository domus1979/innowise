package by.dvn.firsttask.repository.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.repository.CustomIntArrayRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomIntArrayRepositoryImpl implements CustomIntArrayRepository {
    private static final Logger log = LogManager.getLogger();
    private List<CustomIntArray> itemList;

    public CustomIntArrayRepositoryImpl() {
        this.itemList = new ArrayList<CustomIntArray>();
    }

    @Override
    public void save(CustomIntArray customIntArray) {

        int index = itemList.indexOf(customIntArray);
        if (index >= 0) {
            itemList.set(index, customIntArray);
        }
        else {
            itemList.add(customIntArray);
        }

    }

    @Override
    public void remove(CustomIntArray customIntArray) {

        itemList.remove(customIntArray);

    }

    @Override
    public List<CustomIntArray> find() {
        return List.of();
    }

    @Override
    public List<CustomIntArray> sort(Comparator<CustomIntArray> comparator) {
        itemList.sort(comparator);
        return itemList;
    }
}
