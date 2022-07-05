package TwoDimensionsArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(3,3);
        twoDimensionArray.insert(0, 0, 1);
        twoDimensionArray.insert(0, 1, 2);
        System.out.println(Arrays.deepToString(twoDimensionArray.arr));
        twoDimensionArray.accessCell(0, 1);
        twoDimensionArray.traverse2DArray();
        twoDimensionArray.search(2);
    }
}
