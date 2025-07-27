class Employee {
    private int employeeId;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;

    Employee(){

    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary(){
        return monthlySalary * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setName("Anandan");
        emp.setDesignation("Software Engineer");
        emp.setDepartment("IT");
        emp.setMonthlySalary(60000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.calculateSalary());
    }
}

