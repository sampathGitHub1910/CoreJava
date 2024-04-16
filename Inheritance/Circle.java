public class Circle extends Shape{
    private double radius;

    // Constructor for Circle class
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}