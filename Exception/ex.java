package Exception;
/*Task 7: Basic Exception Handling
Write a program that attempts to divide by zero, catches the ArithmeticException, and provides a custom error message.
 */
public class ex {
    public static void main(String[] args) {
        try {
            int res =3/0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        System.out.println("End of the program.");
    }
}