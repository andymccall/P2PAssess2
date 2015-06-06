package uk.co.andymccall;

/**
 * @author  Andy McCall
 * @version 1.0
 * @since   2015-06-06
 *
 * The ManagementEmployee class represents an employee in the Management department.
 * A manager always has an indefinite contract and his/her salary is based on a
 * starting salary of 40000 Bitcoins plus 6000 Bitcoins for every year in the
 * company.
 */

public class ManagementEmployee extends Employee {

    final private int startingSalary=40000;
    final private int yearlyIncrement=6000;

    public ManagementEmployee(String name, int years) {
        super(name,Employee.INDEFINITE,years,"Management");
    }

    public double getSalary() {

        return startingSalary + (yearlyIncrement*getYears());

    }
}
