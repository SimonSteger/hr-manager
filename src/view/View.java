package view;

import java.util.Date;
import java.util.Scanner;

import db.EmployeeDB;
import models.Employee;

public class View {

    private static final Scanner scanner = new Scanner(System.in);
    private static EmployeeDB db = new EmployeeDB();



    /**
     * Show the interface to add a employee to the db
     */
    public void showAddEmployee() {
        //TODO: implement
    	
    	Employee e = new Employee();
    	System.out.println("Please add the Employees credentials:");
    	System.out.println("Name:");
    	e.setPrename(scanner.nextLine());
    	System.out.println("Surname:");
    	e.setSurname(scanner.nextLine());
    	System.out.println("Job Description");
    	e.setJobDescription(scanner.nextLine());
    	System.out.println("Birthdate:");
    	e.setBirthdate(scanner.next());
    	System.out.println("Salary:");
    	e.setSalary(scanner.nextDouble());
    	System.out.println("Employmentdate:");
    	e.setEmploymentDate(scanner.next());
    }

    /**
     * Show the interface to edit a employee to the db
     */
    public void showEditEmployee(String prename, String surname, String jobDescription, Date birthdate, double salary, Date emplyomentDate) {
        //TODO: implement
    	
    }

    /**
     * Show the list of all employees from the db
     */
    public void showListEmployees() {
        //TODO: implement
    	for(Employee)
    }

    /**
     * Show the interface to delete a employee
     */
    public void showDeleteEmployee() {
        //TODO: implement
    }

    /**
     * Internal method to print out a employee
     * @param employee to show
     */
    private void showEmployee(Employee employee) {
        //TODO: implement
    }

}
