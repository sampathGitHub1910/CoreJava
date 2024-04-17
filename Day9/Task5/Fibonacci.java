package Day9.Task5;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int[] fibonacciArray = new int[n];
        generateFibonacci(n, fibonacciArray);

        System.out.println("First " + n + " Fibonacci numbers:");
        System.out.println(Arrays.toString(fibonacciArray));

        int nthElement = fibonacci(n - 1); // Indexing starts from 0, so n-1 for nth element
        System.out.println("The " + n + "th Fibonacci number is: " + nthElement);
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static void generateFibonacci(int n, int[] fibonacciArray) {
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }
    }

    
}