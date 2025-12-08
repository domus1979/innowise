package by.dvn.firsttask.observer.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.entity.CustomIntArrayData;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.observer.CustomIntArrayObserver;
import by.dvn.firsttask.service.CustomArrayService;
import by.dvn.firsttask.service.impl.CustomArrayServiceImpl;
import by.dvn.firsttask.warehouse.WarehouseCustomIntArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomIntArrayObserverImpl implements CustomIntArrayObserver {
    private static final Logger log = LogManager.getLogger();

    @Override
    public void updateWarehouseData(CustomIntArray customIntArray) throws CustomArrayException {
        WarehouseCustomIntArray warehouseCustomIntArray = WarehouseCustomIntArray.getInstance();
        CustomArrayService customArrayService = new CustomArrayServiceImpl();

        int max =  customArrayService.max(customIntArray);
        int min =  customArrayService.min(customIntArray);
        int sum =  customArrayService.sum(customIntArray);

        CustomIntArrayData customIntArrayData = new CustomIntArrayData(max, min, sum);
        warehouseCustomIntArray.putData(customIntArray.getId(), customIntArrayData);
        log.debug("Data " + customIntArrayData + " put in warehouse: " + warehouseCustomIntArray);

    }
}
