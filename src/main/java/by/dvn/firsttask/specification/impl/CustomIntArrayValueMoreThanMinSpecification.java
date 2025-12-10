package by.dvn.firsttask.specification.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.exception.CustomArrayException;
import by.dvn.firsttask.service.CustomArrayService;
import by.dvn.firsttask.service.impl.CustomArrayServiceImpl;
import by.dvn.firsttask.specification.CustomIntArraySpecification;

public class CustomIntArrayValueMoreThanMinSpecification implements CustomIntArraySpecification {
    private final int valueToCompare;

    public CustomIntArrayValueMoreThanMinSpecification(int valueToCompare) {
        this.valueToCompare = valueToCompare;
    }

    @Override
    public boolean isCorrect(CustomIntArray array) {
        CustomArrayService service = new CustomArrayServiceImpl();
        int min;
        try {
            min = service.min(array);
        } catch (CustomArrayException ex) {
            return false;
        }
        return min < valueToCompare;
    }

    @Override
    public String toString() {
        return "CustomIntArrayIdSpecification{" +
                "valueToCompare=" + valueToCompare +
                '}';
    }

}
