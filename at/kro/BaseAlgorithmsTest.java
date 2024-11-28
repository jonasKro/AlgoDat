import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseAlgorithmsTest {
    @Test
    void testMax() {
        int[] data = { 1, 2, 3, 4, 5 };
        Assertions.assertEquals(5, BaseAlgorithms.max(data));
    }

    @Test
    void testMin() {
        int[] data = { 1, 2, 3, 4, 5 };
        Assertions.assertEquals(1, BaseAlgorithms.min(data));
    }

    @Test
    void testRevert() {
        int[] data = { 1, 2, 3, 4, 5 };
        int[] expected = { 5, 4, 3, 2, 1 };
        Assertions.assertArrayEquals(expected, BaseAlgorithms.revert(data));
    }

}
