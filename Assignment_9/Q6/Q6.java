/*Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets 
the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid */
import java.util.Scanner;

class InvalidException extends Exception{
    public InvalidException (String message){
        super(message);
    }
}
public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin: ");
        String pin = sc.nextLine();
        try{
            valid(pin);
            System.out.println("Valid");

        }catch(InvalidException e){
            System.out.println("Error: " + e);
        }
    }

    public static void valid(String pin) throws InvalidException{
        if(pin.length() != 4){
            throw new InvalidException("invalid length");
        }
        if(pin.charAt(0) == '0'){
            throw new InvalidException("First number is 0");
        }
        for(int i = 0;i < 4;i++){
            if(Character.isLetter(pin.charAt(i))){
                throw new InvalidException("numeric character are there");
            }
        }
    }
}
