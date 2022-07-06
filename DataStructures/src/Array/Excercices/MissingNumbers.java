package Array.Excercices;

public class MissingNumbers {
    public static int missingNumber(int[] intArray) {
        int totalSum = 0;
        for (int num: intArray) {
            totalSum += num;
        }
        int n = intArray.length;
        int expectedSum = (n*(n + 1))/2;
        return expectedSum - totalSum;
    }

//    public static int findMissingNumberUsingXor(int[] intArray) {
//        int XOR = 0;
//        for (int i= 0; i< intArray.length; i++) {
//            if(intArray[i] != 0) {
//                XOR ^= intArray[i];
//            }
//        }
//    }

    public static void main(String[] args) {

        int intArray[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.format("The missing number is: %d", missingNumber(intArray));
    }
}


