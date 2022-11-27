package assignments.assignment9;

import java.util.Scanner;

public class BCS134_W9_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name :");
        String name = sc.nextLine();

        System.out.print("Enter the performance : ");
        String performance = sc.nextLine();

        System.out.print("Enter the Employee_id :");
        int emp_id = sc.nextInt();

        System.out.print("Enter the salary :");
        int salary = sc.nextInt();

        

        HR emp = new HR(salary, performance, name, emp_id);
        emp.confidentialDetails();

        sc.close();
    }
}

abstract class EmployeeDetails {
    public String name;
    public int emp_id;

    public void commonEmpDetails() {
        System.out.println(this.name);
        System.out.println(this.emp_id);
    }

    public abstract void confidentialDetails();
}

class HR extends EmployeeDetails {
    private int salary;
    private String performance;

    HR(int salary, String performance, String name, int emp_id) {
        this.salary = salary;
        this.performance = performance;
        this.name = name;
        this.emp_id = emp_id;
    }

    public void confidentialDetails() {
        System.out.println();
        System.out.println("Salary       : " + this.salary);
        System.out.println("Performance  : " + this.performance);
        System.out.println("Name  : " + this.name);
        System.out.println("Emp_id  : " + this.emp_id);
    }

}