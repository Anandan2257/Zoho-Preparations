/*Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to 
integers, and perform division, and catch the following exceptions: InputMismatchException, 
NumberFormatException, ArithmeticException and Exception */

import java.util.Scanner;

class valid{
    public static int searchString(String s) throws NumberFormatException {
       int num = 0;
       boolean value = false;
       int i = 0;
       
       if(s.length() == 0) throw new NumberFormatException("Invalid value");

       if(s.charAt(0) == '-'){
           i += 1;
           value = true;
       }
       for(int j = i; j < s.length();j++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
               num = num * 10 + (ch - '0');
            }else{
                throw new NumberFormatException("Enter number not String");
            }
       }
       if(value){
           num = num * -1;
       }
       return num;

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
