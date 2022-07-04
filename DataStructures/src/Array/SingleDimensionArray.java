package Array;

public class SingleDimensionArray {
    int arr[] = null;
    public SingleDimensionArray(int size) {
        arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This index is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
            }
    }
    public void traverseArray() {
        try {
            for (int j : arr) {
                System.out.println(j + "");

            }
        }
        catch (Exception e){
            System.out.println("Array is no longer exist");
        }
    }

    public void searchInArray(int value) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    System.out.format("Found at index: %d", i);
                    return;
                }
            }
    }

    public void deleteValue(int index) {
        try {
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of the array ");
        }
    }
}
