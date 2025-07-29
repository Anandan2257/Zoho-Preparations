/*Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/

class Student {

    String name;
    int roll_no;

    Student(){
        name = "Jhon";
        roll_no = 1;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no);
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
