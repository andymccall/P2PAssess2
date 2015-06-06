package uk.co.andymccall;

/**
 * Created by Andy on 05/06/2015.
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
    public void setName(String name) { this.name = name; }

    public int getContract() { return contract; }
    public void setContract(int contract) {
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
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {

        String generatedString="";

        generatedString += getName();
        generatedString += ": ";
        generatedString += getDepartment() + " department, ";
        switch (getContract()) {
            case TEMPORARY:
                generatedString += "TEMPORARY contract, ";
                break;
            case TRAINING:
                generatedString += "TRAINING contract, ";
                break;
            case INDEFINITE:
                generatedString += "INDEFINITE contract, ";
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
