/**
 * The AdministrationEmployee class represents an employee in the Administration department.
 */
public class AdministrationEmployee extends Employee {

    /**
     * Implements the constructor for employees in the Administration department, 
     * with calls to the parent class.
     *
     * @param name  String of the name of the employee
     */     
    public AdministrationEmployee(String name) {
        super(name, TEMPORARY, 0, "Administration");
    }

    /**
     * Returns the total salary for employees in the Administration department.
     * 
     * @return  double value of the total salary of the administrator
     */     
    public double getSalary() {
        double salaryFixed = 18000;
        return salaryFixed;
    }        
}