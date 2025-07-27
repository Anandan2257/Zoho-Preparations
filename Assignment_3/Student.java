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
