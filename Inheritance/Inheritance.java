import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Get user input for circle radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a Circle object using user input
        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + circle.area());

        // Get user input for rectangle dimensions
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Create a Rectangle object using user input
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of rectangle: " + rectangle.area());

        scanner.close();
    }
}
