//Develop a Java program to illustrate the usage of toString() method

public class Main {
    public static void main(String[] args) {
        Student std = new Student("Anandan", 21);
        System.out.println(std.display());//normal way

        System.out.println(std);//toString used way
    }    
}

class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String display(){
        return "Name: " + name + " " + "age: " + age; //normal method
    }

    public String toString(){
        return "Name: " + name + " " + "age: " + age; // toString method
    }
}