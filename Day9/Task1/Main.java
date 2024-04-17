package Day9.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 80000.0));
        employees.add(new Employee("Bob", 75000.0));
        employees.add(new Employee("Charlie", 80000.0));
        employees.add(new Employee("David", 90000.0));
        employees.add(new Employee("Alice", 45000));

        Collections.sort(employees, new EmpComparator());
        employees.forEach(System.out::println);        
    }
}