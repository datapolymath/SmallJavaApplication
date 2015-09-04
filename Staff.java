
/**
 * The Staff class creates an array with all the employees in the company, 
 * and then prints the complete staff list on the screen. This class also 
 * calculates and prints the total salary for each of the three departments.
 */
public class Staff {
    public static void main(String[] args) {

        // creates an array with all the employees in Acme Corporation     
        Employee[] employees = new Employee[6];
		employees[0] = new ManagementEmployee("Bill", 9);
		employees[1] = new EngineeringEmployee("Anna" , Employee.INDEFINITE, 9);
		employees[2] = new EngineeringEmployee("John", Employee.INDEFINITE, 5);
		employees[3] = new EngineeringEmployee("Elizabeth" , Employee.TRAINING , 3);
		employees[4] = new EngineeringEmployee("Mchael", Employee.TRAINING, 2);
		employees[5] = new AdministrationEmployee("Albert");

		// prints the complete staff list  		
		for (Employee e : employees){
            System.out.println(e);
        }
        
        // calculates and prints the total salary for each of the three departments
        // and for Acme Corporation
        double managementTotal = 0.0;
        double engineeringTotal = 0.0;
        double administrationTotal = 0.0;
        double acmeTotal;
		for (Employee e : employees){
            if (e.getDepartment().equalsIgnoreCase("management")) {
                managementTotal += e.getSalary();
            } else if (e.getDepartment().equalsIgnoreCase("engineering")) {
                engineeringTotal += e.getSalary();
            } else if (e.getDepartment().equalsIgnoreCase("administration")) {
                administrationTotal += e.getSalary();
            }
        }
        acmeTotal = managementTotal + engineeringTotal + administrationTotal;
        System.out.println();
        System.out.println("MANAGEMENT TOTAL SALARY: " + managementTotal + " bitcoins");
        System.out.println("ENGINEERING TOTAL SALARY: " + engineeringTotal + " bitcoins");        
        System.out.println("ADMINISTRATION TOTAL SALARY: " + administrationTotal + " bitcoins");                
        System.out.println("ACME TOTAL SALARY: " + acmeTotal + " bitcoins");        
    }
}
