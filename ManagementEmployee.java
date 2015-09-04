/**
 * The ManagementEmployee class represents an employee in the Management department.
 */
public class ManagementEmployee extends Employee {
    
    /**
     * Implements the constructor for employees in the Management department, 
     * with calls to the parent class.
     *
     * @param name  String of the name of the employee
     * @param years  number of years in the company
     */ 
    public ManagementEmployee(String name, int years){
        super(name, INDEFINITE, years, "Management");
    }

    /**
     * Returns the total salary for employees in the Management department.
     * 
     * @return  double value of the total salary of the manager
     */
    public double getSalary() {
        double salaryBase = 40000;
        double salaryYear = 6000;
        return salaryBase + salaryYear * getYears();
    }
}