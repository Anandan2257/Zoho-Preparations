import java.util.Scanner;

interface Employee {
    void inputDetails(Scanner sc);
    void calculateSalary();
    void display();
}

class FullTimeEmployee implements Employee {
    int employeeId;
    String name;
    int workingDays;
    double salary;

    @Override
    public void inputDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter number of working days: ");
        workingDays = sc.nextInt();
    }

    @Override
    public void calculateSalary() {
        salary = workingDays * 1000;
    }

    @Override
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Full-Time Working Days: " + workingDays);
        System.out.println("Full-Time Salary: " + salary);
    }
}

class PartTimeEmployee implements Employee {
    int employeeId;
    String name;
    int workingHours;
    double salary;

    @Override
    public void inputDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter number of working hours: ");
        workingHours = sc.nextInt();
    }

    @Override
    public void calculateSalary() {
        salary = workingHours * 100;
    }

    @Override
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Part-Time Working Hours: " + workingHours);
        System.out.println("Part-Time Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Employee emp;

        if (choice == 1) {
            emp = new FullTimeEmployee();
        } else if (choice == 2) {
            emp = new PartTimeEmployee();
        } else {
            System.out.println("Invalid Choice.");
            sc.close();
            return;
        }

        emp.inputDetails(sc);
        emp.calculateSalary();
        emp.display();

        sc.close();
    }
}
