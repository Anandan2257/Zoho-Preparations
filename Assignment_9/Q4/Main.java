/*Write a method to parse a string to an integer. Throw an exception if the string is not a valid 
number. Handle it using try-catch.*/

import java.util.Scanner;

class valid{
    public static int searchString(String s) throws NumberFormatException {
       if(s.length() == 0) throw new NumberFormatException("Invalid value");
       return Integer.parseInt(s);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
    
        try{
            int num1 = valid.searchString(s1);
            int num2 = valid.searchString(s2);
            int value = num1 / num2;
            System.out.println("Result: " + value);
        }catch (NumberFormatException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero");
        }

    }
}
