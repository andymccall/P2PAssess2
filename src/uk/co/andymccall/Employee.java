package uk.co.andymccall;

/**
 * The employed class is a superclass that contains all the common details
 * about an employee in Acme Coorporation.
 *
 * @author  Andy McCall
 * @version 1.0
 * @since   2015-06-06
 */

public abstract class Employee implements Employed {

    // Constants for the types of contracts
    final public static int TEMPORARY=0;
    final public static int TRAINING=1;
    final public static int INDEFINITE=2;

    // Attributes for the employee
    private String name;
    private int contract;
    private int years;
    private String department;

    /**
     * Employee constructor
     * @param name containing name of employee.
     * @param contract containing type of contract.
     * @param years containing number of years worked for company.
     * @param department containing name of department.
     */
    public Employee(String name, int contract, int years, String department) {
        this.setName(name);
        this.setContract(contract);
        this.setYears(years);
        this.setDepartment(department);
    }

    /**
     * Gets the name of the employee.
     * @return name containing name of employee.
     */
    public String getName() { return name; }

    /**
     * Sets the name of the employee.
     * @param name containing name of employee, must not be empty and
     *               cannot contain only whitespace.
     * @exception IllegalArgumentException if name is empty or contains only whitespace.
     */
    public void setName(String name) {
        // Check if the name only contains whitespace or is empty
        // everything else is valid
        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        this.name = name;
    }

    /**
     * Gets the type of contract for the employee.
     * @return the type of contract for the employee.
     */
    public int getContract() { return contract; }

    /**
     * Sets the type of contract for the employee.
     * @param contract containing the type of contract for the employee, must
     *            be one of the constants declared within the class.
     * @exception IllegalArgumentException if the contract is not one of the defined
     *            constants.
     */
    public void setContract(int contract) {
        // Check if the contract is one of our defined constants
        if ((contract < 0) || (contract > 2)) {
            throw new IllegalArgumentException("Invalid contract: " + contract);
        }
        this.contract = contract;
    }

    /**
     * Gets the number of years the employee has worked for the company.
     * @return the number of years the employee has worked for the company.
     */
    public int getYears() { return years; }

    /**
     * Sets the number of years the employee has worked for the company.
     * @param years containing the the number of years the employee has worked
     *            for the company can only be a positive value.
     * @exception IllegalArgumentException if the number of years is negative.
     */
    public void setYears(int years) {
        // Check that the number of years is a positive integer as
        // its not possible to work a negative number of years
        if (years < 0) {
            throw new IllegalArgumentException("Invalid number of years: " + years);
        }
        this.years = years;
    }

    /**
     * Gets the department name the employee works in.
     * @return the department name the employee works in.
     */
    public String getDepartment() { return department; }

    /**
     * Sets the name of the department the employee works in.
     * @param department containing name of the department the employee works in,
     *               must not be empty and cannot contain only whitespace.
     * @exception IllegalArgumentException if name is empty or contains only whitespace.
     */
    public void setDepartment(String department) {
        // Check if the department only contains whitespace or is empty
        // everything else is valid
        if (department.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid department: " + department);
        }
        this.department = department;
    }

    /**
     * Gets all information on the employee.
     * @return information on the employee in the format - name: department, contract type, years worked, salary.
     */
    @Override
    public String toString() {

        String generatedString="";

        generatedString += getName();
        generatedString += ": ";
        generatedString += getDepartment() + " department, ";
        // Switch on getContract and substitute contract text
        switch (getContract()) {
            case TEMPORARY:
                generatedString += "temporary contract, ";
                break;
            case TRAINING:
                generatedString += "training contract, ";
                break;
            case INDEFINITE:
                generatedString += "indefinite contract, ";
                break;
            default:
                throw new IllegalArgumentException("Invalid contract: " + getContract());
        }
        generatedString += getYears() + " years in the company, ";
        generatedString += "salary of " + getSalary() + " bitcoins";

        return generatedString;
    }

    @Override
    public abstract double getSalary();
}
