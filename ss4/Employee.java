package sesson4;

import java.util.Scanner;

public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;
    void inputEmployeeDetail(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        employeeName = scan.next();
        System.out.println("Enter Employee Age");
        employeeAge = scan.nextInt();
        System.out.println("Enter Employee Salary");
        employeeSalary = scan.nextDouble();
        System.out.println("Enter Employee Marital Status");
        maritalStatus = scan.nextBoolean();
    }
    void displayEmployeeDetails(){
        System.out.println("Employee Detail");
        System.out.println("===================");
        System.out.println("Employee Name:"+employeeName);
        System.out.println("Employee Age:"+employeeAge);
        System.out.println("Employee Salary:"+employeeSalary);
        System.out.println("Employee Marital Status:"+maritalStatus);
    }

}
