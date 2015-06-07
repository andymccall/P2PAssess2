package uk.co.andymccall;

/**
 * The ManagementEmployee class represents an employee in the Management department.
 * A manager always has an indefinite contract and his/her salary is based on a
 * starting salary of 40000 Bitcoins plus 6000 Bitcoins for every year in the
 * company.
 *
 * @author  Andy McCall
 * @version 1.0
 * @since   2015-06-06
 */

public class ManagementEmployee extends Employee {

    final private int startingSalary=40000;
    final private int yearlyIncrement=6000;

    /**
     * ManagementEmployee constructor.
     * @param name containing name of employee, must not be empty and
     *               cannot contain only whitespace.
     * @param years containing the the number of years the employee has worked
     *            for the company can only be a positive value.
     */
    public ManagementEmployee(String name, int years) {
        super(name,Employee.INDEFINITE,years,"Management");
    }

    /**
     * Gets the salary for the employee.
     * @return salary of the employee in bitcoins.
     */
    public double getSalary() {

        // Calculate the salary and return
        return startingSalary + (yearlyIncrement*getYears());

    }
}
