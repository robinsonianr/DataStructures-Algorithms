package sortingAndSearching;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchAlgsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void verify() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String expected = "Target value was found at index: 6";
        SearchAlgs search = new SearchAlgs();

        int linIndex = search.linearSearch(arr, 7);
        int binIndex = search.binarySearch(arr, 7);
        int recIndex = search.recursiveBinarySearch(arr, 0, arr.length -1, 7);
        String linResult = search.verify(linIndex);
        String binResult = search.verify(binIndex);
        String recResult = search.verify(recIndex);
        assertEquals(expected, linResult);
        assertEquals(expected, binResult);
        assertEquals(expected, recResult);

    }
}