package by.dvn.firsttask.specification.impl;

import by.dvn.firsttask.entity.CustomIntArray;
import by.dvn.firsttask.specification.CustomIntArraySpecification;

public class CustomIntArrayIdSpecification implements CustomIntArraySpecification {
    private final long valueToCompare;

    public CustomIntArrayIdSpecification(long valueToCompare) {
        this.valueToCompare = valueToCompare;
    }

    @Override
    public boolean isCorrect(CustomIntArray array) {
        return !(array == null || valueToCompare != array.getId());
    }

    @Override
    public String toString() {
        return "CustomIntArrayIdSpecification{" +
                "valueToCompare=" + valueToCompare +
                '}';
    }

}
