public class Test {
    public static void main(String[] args) {
        int[] randomArray = DataGenerator.generateDataArray(10);
        System.out.print("Zufälliges Array: ");
        DataGenerator.printArray(randomArray);

        int[] boundedArray = DataGenerator.generateDataArray(10, 5, 15);
        System.out.print("Array im Bereich [5, 15]: ");
        DataGenerator.printArray(boundedArray);
    }
}
