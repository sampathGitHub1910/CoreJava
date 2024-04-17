package Day9.Task1;

public class Employee {
    String name;
    double sal;
    public Employee( String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee : " + name + ", " + sal;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }
}
