class Employee{
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name,String department, double salary ){
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void display(){
        System.out.println(empId + "\t " + name + "\t " + department + "\t " + salary);
    }
}

public class Q9{
    public static void main(String str[]){
        Employee em = new Employee(1, "Anandan","EEE", 10000000.00);
        em.display();
    }
    
}
