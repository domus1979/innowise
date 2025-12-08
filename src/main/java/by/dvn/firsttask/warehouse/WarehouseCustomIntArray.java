package by.dvn.firsttask.warehouse;

import by.dvn.firsttask.entity.CustomIntArrayData;

import java.util.HashMap;
import java.util.Map;

public class WarehouseCustomIntArray {
    private static WarehouseCustomIntArray instance = new WarehouseCustomIntArray();
    private final Map<Long, CustomIntArrayData> map = new HashMap<>();

    public static WarehouseCustomIntArray getInstance() {
        if (instance == null) {
            instance = new WarehouseCustomIntArray();
        }
        return instance;
    }

    public CustomIntArrayData getData(Long id) {
        return map.get(id);
    }

    public void putData(Long id, CustomIntArrayData customIntArrayData) {
        map.put(id, customIntArrayData);
    }

    @Override
    public String toString() {
        return "WarehouseCustomIntArray{" +
                "map=" + map.toString() +
                '}';
    }
}
