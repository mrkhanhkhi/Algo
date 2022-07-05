package TwoDimensionsArray;

public class TwoDimensionArray {
    int arr[][] = null;

    public TwoDimensionArray(int rowNums, int colNums) {
        this.arr = new int[rowNums][colNums];
        for (int row = 0; row < arr.length; row ++) {
            for (int col = 0; col < arr[0].length; col ++ ) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Insert value successful");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void accessCell(int row, int col) {
        System.out.println("\nAccessing row#" + row + ", Col#" + col);
        try {
            System.out.println("Cell value is: "+ arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void traverse2DArray() {
        for (int row = 0; row < arr.length; row ++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.println(arr[row][col] + "");
            }
            System.out.println();
        }
    }

    public void search(int value) {
        for (int row = 0; row < arr.length; row ++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("\nValue is found at row" + row + ", Col" + col);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    public void delete(int rowIndex, int colIndex) {
        try {
            arr[rowIndex][colIndex] = Integer.MIN_VALUE;
            System.out.println("Delete successful");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");
        }
    }
}
