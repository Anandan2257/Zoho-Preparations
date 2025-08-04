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
        Double newBalance = balance + (balance + interest); //autoboking
        System.out.println("New Balance After Adding 4 %: " + this.balance * 4);
    }
}

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Account> bankDetails = new ArrayList<>();

        double interestRatePrimitive = 0.04;
        Double interestRate = Double.valueOf(interestRatePrimitive); //Boking

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
