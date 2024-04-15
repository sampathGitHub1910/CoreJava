import java.util.Scanner;

/*
        Task 4: Constructors
        Implement a Matrix class that has a constructor which initializes the dimensions of a matrix and 
        a method to fill the matrix with values.
*/

public class Matrix {
    private int[][] matrix;

    // Constructor to initialize the dimensions of the matrix
    public Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    // Method to fill the matrix with values
    public void fillMatrixUsing() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for the matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter value at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Create a Matrix object with user-specified dimensions
        Matrix myMatrix = new Matrix(rows, cols);

        myMatrix.fillMatrixUsing();

        // Print the matrix
        System.out.println("\nMatrix:");
        myMatrix.printMatrix();

        scanner.close();
    }
}
