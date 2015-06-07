package uk.co.andymccall;

/**
 * The EngineeringEmployee class represents an employee in the Engineering department.
 * The salary of an engineer starts with 25000 Bitcoins and is incremented in 2500
 * Bitcoins each complete year that he/she stays in the company.
 *
 * @author  Andy McCall
 * @version 1.0
 * @since   2015-06-06
 */

public class EngineeringEmployee extends Employee {

    final private int startingSalary=25000;
    final private int yearlyIncrement=2500;

    /**
     * EngineeringEmployee constructor.
     * @param name containing name of employee, must not be empty and
     *               cannot contain only whitespace.
     * @param contract containing the type of contract the employee has.
     * @param years containing the the number of years the employee has worked
     *            for the company can only be a positive value.
     */
    public EngineeringEmployee(String name, int contract, int years) {
        super(name,contract,years,"Engineering");
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
