package uk.co.andymccall;

/**
 * @author  Andy McCall
 * @version 1.0
 * @since   2015-06-06
 */

public abstract class Employee implements Employed {

    final public static int TEMPORARY=0;
    final public static int TRAINING=1;
    final public static int INDEFINITE=2;

    private String name;
    private int contract;
    private int years;
    private String department;

    public Employee(String name, int contract, int years, String department) {

        this.setName(name);
        this.setContract(contract);
        this.setYears(years);
        this.setDepartment(department);

    }

    public String getName() { return name; }
    public void setName(String name) {
        // Check if the name only contains whitespace or is empty
        // everything else is valid
        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        this.name = name;
    }

    public int getContract() { return contract; }
    public void setContract(int contract) {
        // Check if the contract is one of our constants
        if ((contract < 0) || (contract > 2)) {
            throw new IllegalArgumentException("Invalid contract: " + contract);
        }
        this.contract = contract;
    }

    public int getYears() { return years; }
    public void setYears(int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Invalid number of years: " + years);
        }
        this.years = years;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) {
        // Check if the department only contains whitespace or is empty
        // everything else is valid
        if (department.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid department: " + department);
        }
        this.department = department;
    }

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
