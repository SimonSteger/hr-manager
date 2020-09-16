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
    public String showEditEmployee() {
        //TODO: implement
    	
    	EmployeeDB edb = new EmployeeDB();
    	for(Employee e: edb.getEmployees()) {
    		System.out.println("Id" + e.getId() + "Name: " + e.getPrename() + "Surname: " + e.getSurname() + "Jobdescription: " + e.getJobDescription() + "Birthdate: " + e.getBirthdate() + "Salary: " + e.getSalary() + "Employmentdate: " + e.getEmploymentDate());
    	}
    	System.out.println("Which employee do you want to edit? Enter his id and press enter.");
    	return scanner.nextLine();
    	
    }

    /**
     * Show the list of all employees from the db
     */
    public void showListEmployees() {
        //TODO: implement
    	EmployeeDB edb = new EmployeeDB();
    	for(Employee e: edb.getEmployees()) {
    		System.out.println("Name: " + e.getPrename() + "Surname: " + e.getSurname() + "Jobdescription: " + e.getJobDescription() + "Birthdate: " + e.getBirthdate() + "Salary: " + e.getSalary() + "Employmentdate: " + e.getEmploymentDate());
    	}
    }

    /**
     * Show the interface to delete a employee
     */
    public String showDeleteEmployee() {
        //TODO: implement
    	EmployeeDB edb = new EmployeeDB();
    	for(Employee e: edb.getEmployees()) {
    		System.out.println("Id" + e.getId() + "Name: " + e.getPrename() + "Surname: " + e.getSurname() + "Jobdescription: " + e.getJobDescription() + "Birthdate: " + e.getBirthdate() + "Salary: " + e.getSalary() + "Employmentdate: " + e.getEmploymentDate());
    	}
    	System.out.println("Which employee do you want to delete? Enter his id and press enter.");
    	return scanner.nextLine();
    }

    /**
     * Internal method to print out a employee
     * @param employee to show
     */
    private void showEmployee(Employee employee) {
        //TODO: implement
    	System.out.println("Id" + employee.getId() + "Name: " + employee.getPrename() + "Surname: " + employee.getSurname() + "Jobdescription: " + employee.getJobDescription() + "Birthdate: " + employee.getBirthdate() + "Salary: " + employee.getSalary() + "Employmentdate: " + employee.getEmploymentDate());
    }

}
