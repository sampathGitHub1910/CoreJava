package Day9.Task1;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        // First compare by salary
        //int salaryComparison = Double.compare(e1.getSal(), e2.getSal());
        
        //if (salaryComparison != 0) {
        //    return salaryComparison;
        //} else {
            // If salary is the same, compare by name
        //    return e1.getName().compareTo(e2.getName());
        //}
        
        //if(e1.getSal() < e2.getSal()){
        //    return -1;
        //}
        //return 0;
        int cname = e1.getName().compareTo(e2.getName());
        if(cname != 0){
            return cname;
        }
        return Double.compare(e1.getSal(), e2.getSal());
    }
    
}
