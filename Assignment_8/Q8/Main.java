/*Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid 
CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */


class Students implements Cloneable{
    String name;
    int rollNo;
    String department;

    Students(String name,int roll_no, String department){
        this.name = name;
        this.rollNo = roll_no;
        this.department = department;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    } 
}


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Students std = new Students("Anandan", 06, "EEE");
        Students std1 = (Students) std.clone();

        std.name = "abi";
        
        System.out.println(std.name);
        System.out.println(std1.name); //shallow copy 
    }    
}
