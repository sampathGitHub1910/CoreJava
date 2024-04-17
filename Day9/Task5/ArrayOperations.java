package Day9.Task5;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int startIndex = 1;
        int endIndex = 3;
        int[] slicedArray = sliceArray(array, startIndex, endIndex);
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Sliced array from index " + startIndex + " to " + endIndex + ": " + Arrays.toString(slicedArray));
    }

    private static int[] sliceArray(int[] arr, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= arr.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start and end indices");
        }

        int[] slicedArray = new int[endIndex - startIndex + 1];
        for (int i = startIndex, j = 0; i <= endIndex; i++, j++) {
            slicedArray[j] = arr[i];
        }
        return slicedArray;
    }
}
