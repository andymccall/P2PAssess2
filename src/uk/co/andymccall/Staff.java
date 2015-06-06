package uk.co.andymccall;

/**
 * Created by Andy on 05/06/2015.
 */
public class Staff {
    
    public Staff()

    {

        Employee[] staffArray = new Employee[6];
        double totalSalary = 0.0;
        double totalManagementSalary = 0.0;
        double totalEngineeringSalary = 0.0;
        double totalAdministrationSalary = 0.0;

        // Add the employees to the array.
        staffArray[0] = new ManagementEmployee("Bill", 9);
        staffArray[1] = new EngineeringEmployee("Anna", Employee.INDEFINITE, 9);
        staffArray[2] = new EngineeringEmployee("John", Employee.INDEFINITE, 5);
        staffArray[3] = new EngineeringEmployee("Elizabeth", Employee.TRAINING, 3);
        staffArray[4] = new EngineeringEmployee("Michael", Employee.TRAINING, 2);
        staffArray[5] = new AdministrationEmployee("Albert");

        // For each employee in the array
        for (int i = 0; i < staffArray.length; i++) {
            // Print the required output
            System.out.println(staffArray[i].toString());
            // Check to see which department the employee is in
            // and add their salary to the total for the department
            switch (staffArray[i].getDepartment()) {
                case "Management":
                    totalManagementSalary += staffArray[i].getSalary();
                    break;
                case "Engineering":
                    totalEngineeringSalary += staffArray[i].getSalary();
                    break;
                case "Administration":
                    totalAdministrationSalary += staffArray[i].getSalary();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid department: " + staffArray[i].getDepartment());

            }
        }

        // Extra line to match assignment output
        System.out.println();

        // Calculate the salaries of all department
        totalSalary = totalManagementSalary + totalEngineeringSalary + totalAdministrationSalary;

        // Print out the total salaries
        System.out.println("MANAGEMENT TOTAL SALARY: " + totalManagementSalary + " bitcoins");
        System.out.println("ENGINEERING TOTAL SALARY: " + totalEngineeringSalary + " bitcoins");
        System.out.println("ADMINISTRATION TOTAL SALARY: " + totalAdministrationSalary + " bitcoins");
        System.out.println("ACME TOTAL SALARY: " + totalSalary + " bitcoins");

    }
}
