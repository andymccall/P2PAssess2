package uk.co.andymccall;

/**
 * @author  Andy McCall
 * @version 1.0
 * @since   2015-06-06
 *
 * The EngineeringEmployee class represents an employee in the Engineering department.
 * The salary of an engineer starts with 25000 Bitcoins and is incremented in 2500
 * Bitcoins each complete year that he/she stays in the company.
 */

public class EngineeringEmployee extends Employee {

    final private int startingSalary=25000;
    final private int yearlyIncrement=2500;

    public EngineeringEmployee(String name, int contract, int years) {
        super(name,contract,years,"Engineering");
    }

    public double getSalary() {

        return startingSalary + (yearlyIncrement*getYears());

    }
}
