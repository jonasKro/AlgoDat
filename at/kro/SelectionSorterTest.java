import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSorterTest {
    Sorter testSorter = new SelectionSorter();

    @Test
    void testSort() {
        int[] data = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        Assertions.assertArrayEquals(testSorter.sort(data), expected);
    }
}
