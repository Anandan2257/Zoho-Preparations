/*Design a login system that throws AuthenticationException if the username or password is 
incorrect. Handle it and display a login failure message. */

import java.util.Scanner;

class AuthenticationException extends Exception{
    public AuthenticationException(String message){
         super(message);
    }
   
}
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter UserName: ");
            String username = sc.nextLine();
            System.out.print("Enter Password: ");
            String password = sc.nextLine();
            isValidPassword(username,password);
        }catch(AuthenticationException e){
            System.out.println(e.getMessage());
        }
    }

    public static void isValidPassword(String s1,String s2) throws AuthenticationException{
        String userName = "Anandan";
        String password = "Anandan@2257";
        if(s1.equals(userName) && s2.equals(password)){
            throw new AuthenticationException("Valid Password and Username");
        }else{
             throw new AuthenticationException("Invalid Password and Username");
        }
    }
}
