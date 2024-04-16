package EmployeeExample;

public class emp {
    String name;
    String role;
    double salary;
    String id;

    public emp(String id, String name, String role, double salary){
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Emp: {" +id +", "+ name + ", " + role + ", " + salary + "}";
    }
}