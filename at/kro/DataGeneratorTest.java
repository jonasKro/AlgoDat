
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {

        int[] array1 = DataGenerator.generateDataArray(10);
        Assertions.assertEquals(array1.length, 10);
    }

    @Test
    void testGenerateDataArray2() {

        int[] array2 = DataGenerator.generateDataArray(10, 5, 15);
        Assertions.assertEquals(array2.length, 10);
    }

    @Test
    void testPrintArray() {
        int[] array = DataGenerator.generateDataArray(10);
        DataGenerator.printArray(array);

    }
}
