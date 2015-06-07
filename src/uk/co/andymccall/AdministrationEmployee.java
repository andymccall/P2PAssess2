package uk.co.andymccall;

/**
 * The AdministrationEmployee class represents an employee in the Administration department.
 * These employees are hired from employment agencies, so his/her contracts are always
 * temporary and count as 0 years in the company. The salary is fixed, 18000 Bitcoins.
 *
 * @author  Andy McCall
 * @version 1.0
 * @since   2015-06-06
 */

public class AdministrationEmployee extends Employee {

    final private int startingSalary=18000;

    /**
     * AdministrationEmployee constructor.
     * @param name containing name of employee, must not be empty and
     *               cannot contain only whitespace.
     */
    public AdministrationEmployee(String name) {
        super(name,Employee.TEMPORARY,0,"Administration");
    }

    /**
     * Gets the salary for the employee.
     * @return salary of the employee in bitcoins.
     */
    public double getSalary() {

        // Calculate the salary and return
        return startingSalary;
    }
}
