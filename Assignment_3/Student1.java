/*Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) 
and store and display the details for two students having names "Sam" and "John" respectively.*/

class Student1{
    String name;
    int roll_no;
    int phone_no;
    String address;

    Student1(String name,int roll_no,int phone_no,String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    void display(){
        System.out.println(name + " " + roll_no + " " + phone_no + " " + address);
    }
    public static void main(String[] args) {
        Student1 student1 = new Student1("Sam",1,94863,"xxx");
        Student1 student2 = new Student1("Jhon",2,123456,"yyy");
        student1.display();
        student2.display();
    }
}
