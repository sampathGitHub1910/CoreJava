package Day9.Task2;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        int target = 9;
        int index = performLinearSearch(array, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    private static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1;
    }
}
