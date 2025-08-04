/* Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed). */
import java.util.*;
class Account{
    int accountNumber;
    String holderName;
    double balance;

    Account(int accountNumber,String holderName,double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void display(){
        System.out.println("Acoount number: " + this.accountNumber + " Holder Name: " + this.holderName + " Balance: " + this.balance);
    }

    void newBalance(double interest){
        Double newBalance = balance + (balance + interest); //autoboxing
        System.out.println("New Balance After Adding 4 %: " + this.balance * 4);
    }
}

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Account> bankDetails = new ArrayList<>();

        double interestRatePrimitive = 0.04;
        Double interestRate = Double.valueOf(interestRatePrimitive); //Boxing

        bankDetails.add(new Account(101,"Anandan", 100000));
        bankDetails.add(new Account(102,"Abi", 150000));
        bankDetails.add(new Account(104,"Tamil", 160000));

        System.out.println("Before Applying Interest: ");

        for(Account acc : bankDetails){
            acc.display();
        }

        System.out.println("After Applying Interest:");

        for(Account acc : bankDetails){
            acc.newBalance(interestRatePrimitive);
            acc.display();
        }
    }
}
