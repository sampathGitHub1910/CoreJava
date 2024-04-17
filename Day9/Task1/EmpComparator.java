package Day9.Task1;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int salaryCompare = Double.compare(e1.getSal(), e2.getSal());
        if (salaryCompare == 0) {
            return e1.getName().compareTo(e2.getName());
        }
        return salaryCompare;
    }
}
