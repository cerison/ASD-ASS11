import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;

    @BeforeEach
    void setUp() {
        this.arrayFlattener = new ArrayFlattener();
    }

    @AfterEach
    void tearDown() {
        this.arrayFlattener = null;
    }

    @Test
    void validArray() {
        int[][] arr = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {1, 3, 0, 4, 5, 9};

        int[] actual = arrayFlattener.flattenArray(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    void nullArray() {
        int[][] arr = null;
        int[] expected = null;

        int[] actual = arrayFlattener.flattenArray(arr);
        assertArrayEquals(expected, actual);
    }
}
