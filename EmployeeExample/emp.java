package EmployeeExample;

public class emp {
    String name;
    String role;
    double salary;

    public emp(String name, String role, double salary){
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Emp: {" + name + ", " + role + ", " + salary + "}";
    }
}