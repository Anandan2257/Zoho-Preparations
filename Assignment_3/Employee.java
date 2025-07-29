/*3. Write a Java program where you define a class named Employee. Inside the class, define fields 
to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, 
and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a 
new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/
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
