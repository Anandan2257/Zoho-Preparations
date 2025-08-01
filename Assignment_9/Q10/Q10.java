/*Write a Java program to manage a voting system where a person must be at least 18 years 
old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible 
person tries to register for voting. Display appropriate messages for eligible and ineligible voters */

import java.util.Scanner;

class isValidOrNot extends Exception{
    public isValidOrNot(String message){
        super(message);
    }
}
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            isEligible(age);
        }catch(isValidOrNot e){
            System.out.println(e.getMessage());
        }
    }

    public static void isEligible(int age) throws isValidOrNot{
        if(age >= 18){
            throw new isValidOrNot("Eligible Voter");
        }else{
            throw new isValidOrNot("Not Eligible");
        }
    }    

}
