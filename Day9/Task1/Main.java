package Day9.Task1;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", 80000.0),
            new Employee("Bob", 75000.0),
            new Employee("Charlie", 80000.0),
            new Employee("David", 90000.0)
        );


        try{
            Collections.sort(employees, new EmpComparator());
            employees.forEach(System.out::println);
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
}