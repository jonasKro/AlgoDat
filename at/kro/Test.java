public class Test {
    public static void main(String[] args) {
        int[] randomArray = DataGenerator.generateDataArray(10);
        System.out.print("Zufälliges Array: ");
        DataGenerator.printArray(randomArray);

        int[] boundedArray = DataGenerator.generateDataArray(10, 5, 15);
        System.out.print("Array im Bereich [5, 15]: ");
        DataGenerator.printArray(boundedArray);

        Bubblesorter bs = new Bubblesorter();
        int[] sorterarr = bs.sort(boundedArray);
        DataGenerator.printArray(sorterarr);

        SelectionSorter ss = new SelectionSorter();
        int[] sortedArr = ss.sort(DataGenerator.generateDataArray(10, 3, 11));
        DataGenerator.printArray(sortedArr);
    }
}
