/**
 * The Employee class models a generic employee.
 */
public abstract class Employee implements Employed {

    // the three types of contracts
    public static final int TEMPORARY = 0;
    public static final int TRAINING = 1;
    public static final int INDEFINITE = 2;

    // the employee attributes 
    private String name;
    private int contract;
    private int years;
    private String department;   
    
    /**
     * Implements the constructor for employees.
     *
     * @param name  String of the name of the employee
     * @param contract  the type of contract (TEMPORARY, TRAINING, INDEFINITE)
     * @param years  number of years in the company
     * @param department  String of department to which the employee belongs
     */ 
    public Employee (String name, int contract, int years, String department) {
        setName(name);
        setContract(contract);
        setYears(years);
        setDepartment(department);
    }

	/**
     * Sets the name of the employee.
     * 
     * @param name  String of the name of the employee
     */
    public void setName(String name) {
        if (name instanceof String && !name.isEmpty() && name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name of the employee.");
        }
    }

	/**
     * Gets the name of the employee.
     * 
     * @return  String of the name of the employee
     */    
    public String getName() {
        return name;
    }
    
	/**
     * Sets the contract type of the employee.
     * 
     * @param contract  the type of contract (TEMPORARY, TRAINING, INDEFINITE)
     */    
    public void setContract(int contract) {
        if (contract == TEMPORARY || contract == TRAINING || contract == INDEFINITE) {
            this.contract = contract;
        } else {
            throw new IllegalArgumentException("Invalid type of contract.");
        }
    }

	/**
     * Gets the contract type of the employee.
     * 
     * @return  the type of contract (TEMPORARY, TRAINING, INDEFINITE)
     */      
    public int getContract() {
        return contract;
    }
    
	/**
     * Sets the employee's years employed.
     * 
     * @param years  number of years in the company
     */        
    public void setYears(int years) {
        if (years >= 0 && years <= 50) {
            this.years = years;
        } else {
            throw new IllegalArgumentException("Invalid number of years in the company.");
        }
    }

	/**
     * Gets the employee's years employed.
     * 
     * @return  number of years in the company
     */     
    public int getYears() {
        return years;
    }    

	/**
     * Sets the department to which the employee belongs.
     * 
     * @param department  String of department to which employee belongs
     */     
    public void setDepartment(String d) {
        if (d.equalsIgnoreCase("management") || d.equalsIgnoreCase("engineering") || d.equalsIgnoreCase("administration")) {
            this.department = d;
        } else {
            throw new IllegalArgumentException("Invalid department to which he/she belongs.");
        }
    }

	/**
     * Gets the department to which the employee belongs.
     * 
     * @return  String of department to which employee belongs
     */        
    public String getDepartment() {
        return department;
    }     

    /**
     * Abstract method that returns the total salary of the employee.
     * 
     * @return  double value of the total salary of the employee
     */
    public abstract double getSalary();

	/**
     * Returns the description of the employee
     * 
     * @return  String of the description of the employee
     */     
    public String toString() {
        String type[] = {"temporary", "training", "indefinite"};
        String part = "- " + getName() + ": " + getDepartment() + " department, " + type[getContract()] + " contract, ";
        return part + getYears() + " years in the company, salary of " + getSalary() + " bitcoins";
    }
}