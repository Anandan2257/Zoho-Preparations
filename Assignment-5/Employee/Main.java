import java.util.Scanner;

class Employee {
    String name;
    int employeeId;

    void inputDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }

    void calculateSalary() {
        System.out.println("Calculating salary");
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
    }
}


class FullTimeEmployee extends Employee {
    int workingDays;
    double salary;

    void inputFullTimeDetails(Scanner sc) {
        inputDetails(sc);
        System.out.print("Enter number of working days: ");
        workingDays = sc.nextInt();
    }

    @Override
    void calculateSalary() {
        salary = workingDays * 1000;
    }

    void displayFullTimeDetails() {
        display();
        System.out.println("Full-Time Working Days: " + workingDays);
        System.out.println("Full-Time Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    int workingHours;
    double salary;

    void inputPartTimeDetails(Scanner sc) {
        inputDetails(sc);
        System.out.print("Enter number of working hours: ");
        workingHours = sc.nextInt();
    }

    @Override
    void calculateSalary() {
        salary = workingHours * 100;
    }

    void displayPartTimeDetails() {
        display();
        System.out.println("Part-Time Working Hours: " + workingHours);
        System.out.println("Part-Time Salary: " + salary);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            FullTimeEmployee ft = new FullTimeEmployee();
            ft.inputFullTimeDetails(sc);
            ft.calculateSalary();
            ft.displayFullTimeDetails();
        } else if (choice == 2) {
            PartTimeEmployee pt = new PartTimeEmployee();
            pt.inputPartTimeDetails(sc);
            pt.calculateSalary();
            pt.displayPartTimeDetails();
        } else {
            System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
