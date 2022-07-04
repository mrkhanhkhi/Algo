package Array;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 9);
        sda.insert(1, 8);
        sda.insert(2, 4);
        sda.insert(4, 19);
        sda.insert(4, 32);
        sda.insert(5, 22);
        sda.insert(6, 11);
        sda.traverseArray();
        sda.searchInArray(4421);
        sda.deleteValue(3);
    }
}
