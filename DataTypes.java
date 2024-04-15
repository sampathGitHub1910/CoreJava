/*
    Task 1: Data Types/Variables
    Write a program that declares two integer variables, swaps their values without using a third variable, and prints the result.
 */
import java.util.Scanner;
public class DataTypes {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        // Display the initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

         // Display the swapped values
         System.out.println("After swapping:");
         System.out.println("a = " + a);
         System.out.println("b = " + b);

         sn.close();
    }
}
