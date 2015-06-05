package uk.co.andymccall;

/**
 * The AdministrationEmployee class represents an employee in the Administration department.
 * These employees are hired from employment agencies, so his/her contracts are always
 * temporary and count as 0 years in the company. The salary is fixed, 18000 Bitcoins.
 */
public class AdministrationEmployee extends Employee {

    final private int startingSalary=18000;

    public AdministrationEmployee(String name) {
        super(name,Employee.TEMPORARY,0,"Administration");
    }

    public double getSalary() {
        return startingSalary;
    }
}
