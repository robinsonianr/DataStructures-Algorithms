package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStructTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void editElements() {
        ArrayStruct arr = new ArrayStruct();

        int[] arrOne = arr.editElement(1, 21);
        int[] correctArr = {420, 21, 21, 8902};

        assertArrayEquals(correctArr, arrOne);
    }
}