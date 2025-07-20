class Employee {
    String employee_name;
    int employee_ID;
    String designation;
    double salary;

    Employee(){
        System.out.println("object has been created"); 
        employee_name = null;
        employee_ID = 0;
        designation = "None";
        salary = 0.0;  
    }
    Employee(String employee_name,int employee_ID,String designation,double salary){
        this.employee_name = employee_name;
        this.employee_ID = employee_ID;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee e) {
        this.employee_name = e.employee_name;
        this.employee_ID = e.employee_ID;
        this.designation = e.designation;
        this.salary = e.salary;
    }

      void display() {
        System.out.println("Name: " + employee_name + ", ID: " + employee_ID+ ", Designation: " + designation + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new Employee("Anandan",1,"developer",100000000.00);
        Employee emp2 = new Employee(emp1);
        emp.display();
        emp1.display();
        emp2.display();
    }
}
