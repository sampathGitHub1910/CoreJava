package Day9.Task2;

import java.util.Arrays;

public class BruteForceSort {
    public static void bruteForceSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        do {
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap elements
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting: " + Arrays.toString(array));
        bruteForceSort(array);
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
