package Day9.Task4;

public class RecursiveSumArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array);
        System.out.println("Sum of elements in the array: " + sum);
    }

    private static int sumArray(int[] arr) {
        return sumArrayRecursive(arr, 0);
    }

    private static int sumArrayRecursive(int[] arr, int i) {
        if (i == arr.length) {
            return 0; // Base case: sum of an empty array is 0
        }
        return arr[i] + sumArrayRecursive(arr, i + 1);
    }
}
