/**
 * The EngineeringEmployee class represents an employee in the Engineering department.
 */
public class EngineeringEmployee extends Employee {

    /**
     * Implements the constructor for employees in the Engineering department, 
     * with calls to the parent class.
     *
     * @param name  String of the name of the employee
     * @param contract  the type of contract (TEMPORARY, TRAINING, INDEFINITE)
     * @param years  number of years in the company
     */ 
    public EngineeringEmployee(String name, int contract, int years) {
        super(name, contract, years, "Engineering");
    }

    /**
     * Returns the total salary for employees in the Engineering department.
     * 
     * @return  double value of the total salary of the engineer
     */    
    public double getSalary() {
        double salaryBase = 25000;
        double salaryYear = 2500;
        return salaryBase + salaryYear * getYears();
    }    
}