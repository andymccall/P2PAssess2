package uk.co.andymccall;

public class Main {

    public static void main(String[] args) {

        // Total salary
        double total = 0.0;

        // Management Employee
        ManagementEmployee me1 = new ManagementEmployee("Bill", 9);
        System.out.println(me1.toString());
        System.out.println("My name is " + me1.getName() + " and my salary is " + me1.getSalary() + " bitcoins");
        total += me1.getSalary();

        // Engineering Employee
        EngineeringEmployee me2 = new EngineeringEmployee("Anna", Employee.INDEFINITE, 9);
        System.out.println(me2.toString());
        System.out.println("My name is " + me2.getName() + " and my salary is " + me2.getSalary() + " bitcoins");
        total += me2.getSalary();

        // Engineering Employee
        EngineeringEmployee me3 = new EngineeringEmployee("John", Employee.INDEFINITE, 5);
        System.out.println(me3.toString());
        System.out.println("My name is " + me3.getName() + " and my salary is " + me3.getSalary() + " bitcoins");
        total += me3.getSalary();

        // Engineering Employee
        EngineeringEmployee me4 = new EngineeringEmployee("Elizabeth", Employee.TRAINING, 3);
        System.out.println(me4.toString());
        System.out.println("My name is " + me4.getName() + " and my salary is " + me4.getSalary() + " bitcoins");
        total += me4.getSalary();

        // Engineering Employee
        EngineeringEmployee me5 = new EngineeringEmployee("Michael", Employee.TRAINING, 2);
        System.out.println(me5.toString());
        System.out.println("My name is " + me5.getName() + " and my salary is " + me5.getSalary() + " bitcoins");
        total += me5.getSalary();

        // Administration Employee
        AdministrationEmployee me6 = new AdministrationEmployee("Albert");
        System.out.println(me6.toString());
        System.out.println("My name is " + me6.getName() + " and my salary is " + me6.getSalary() + " bitcoins");
        total += me6.getSalary();

        // Total Salary Calculation
        System.out.println("The total salary is " + total + " bitcoins.");

    }
}
