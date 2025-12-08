package by.dvn.firsttask.entity;

public class CustomIntArrayData {
    private int max, min, sum;

    public CustomIntArrayData(int max, int min, int sum) {
        this.max = max;
        this.min = min;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "CustomIntArrayData{" +
                "max=" + max +
                ", min=" + min +
                ", sum=" + sum +
                '}';
    }

}
