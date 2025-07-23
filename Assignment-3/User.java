class Application {
    private String name;
    private int age;
    private String phoneNumber;
    private String department;
    private String dateOfBirth;

    Application(String name, int age, String phoneNumber, String department, String dateOfBirth){
        this.name = name;
        this.age = age;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;

    }

    void display(){
        System.out.println("Name: " + name + " age: " + age + " department: " + department + " phoneNumber" + phoneNumber + " Date of Birth: " + dateOfBirth);
    }

    void setApplication(String name,int age,String department,String phoneNumber,String dateOfBirth){
        this.name = name;
        this.age = age;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    void getApplication(){
        display();
    }

}

public class User {
     public static void main(String[] args) {
        Application app2 = new Application("Anandan", 22, "9876543210", "IT", "01-01-2003");
        app2.getApplication();
    }
}