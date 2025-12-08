package by.dvn.firsttask.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomIntArrayTest {

    private CustomIntArray customArray;

    @BeforeEach
    public void setUp() {
        customArray = null;
    }

    @Test
    public void testDefaultConstructor() {
        customArray = new CustomIntArray();
        assertNull(customArray.getArray(), "Default constructor should create null array");
    }

    @Test
    public void testConstructorWithSize(){
        int size = 5;
        customArray = new CustomIntArray(size);

        assertNotNull(customArray.getArray(), "Array should not be null");
        assertEquals(size, customArray.getArray().length, "Array length should match size parameter");

        // Verify all elements are initialized to 0
        for (int i = 0; i < size; i++) {
            assertEquals(0, customArray.getArray()[i], "Elements should be initialized to 0");
        }
    }

    @Test
    public void testConstructorWithArray() {
        int[] originalArray = {1, 2, 3, 4, 5};
        customArray = new CustomIntArray(originalArray);

        assertNotNull(customArray.getArray(), "Array should not be null");
        assertArrayEquals(originalArray, customArray.getArray(), "Arrays should be equal");
        assertNotSame(originalArray, customArray.getArray(), "Array should be a copy, not the same reference");
    }

    @Test
    void getArr() {
        int[] testArray = {10, 20, 30};
        customArray = new CustomIntArray(testArray);

        int[] result = customArray.getArray();
        assertArrayEquals(testArray, result, "getArr should return array with same values");
    }

    @Test
    void setArr() {
        customArray = new CustomIntArray(3);
        int[] newArray = {5, 10, 15};

        customArray.setArray(newArray);

        assertArrayEquals(newArray, customArray.getArray(), "setArr should update the array");
        assertNotSame(newArray, customArray.getArray(), "setArr should create a copy");
    }
}