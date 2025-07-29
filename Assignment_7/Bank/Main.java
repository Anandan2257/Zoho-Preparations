import java.util.Scanner;

class Customer{
    String name;
    int age;
    String aadharNumber;
    String phoneNumber;

    Customer(String name,int age,String aadharNumber,String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.aadharNumber = aadharNumber;
    }
}

class Account{
    int accountNumber;
    double balance;

    Account(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposite(double amount){
        balance += amount;
    }

    public boolean Withdrawal(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }else{
            return false;
    }
    }

    public double getBalance() {
        return balance;
    }
}
abstract class RBI{
    public final int minimumInterestRate = 4;
    public final double minimumBalanceAllowed = 2000.0;
    public final double maximumWithdrawalLimit = 25000.0; 
    public abstract double GetInterestRate();
    public abstract double getMinBalance();
    public abstract double GetWithdrawalLimit();

    public void showRBIGuidelines() {
        System.out.println("RBI Guidelines:");
        System.out.println("Minimum Interest Rate: " + minimumInterestRate+ "%");
        System.out.println("Minimum Balance: " + minimumBalanceAllowed);
        System.out.println("Maximum Withdrawal Limit per transaction: " + maximumWithdrawalLimit);
    }
}

class SBI extends RBI{
    public int minimumInterestRate = 5;
    public double minimumBalanceAllowed = 2500.0;
    public double maximumWithdrawalLimit = 50000.0; 

    public double GetInterestRate(){
        return minimumInterestRate;
    }
     public double getMinBalance() {
        return minimumBalanceAllowed;
    }
    public double GetWithdrawalLimit(){
        return maximumWithdrawalLimit;
    }

}

class ICICI extends RBI{
    public int minimumInterestRate = 4;
    public double minimumBalanceAllowed = 2000.0;
    public double maximumWithdrawalLimit = 40000.0; 

    public double GetInterestRate(){
        return minimumInterestRate;
    }
     public double getMinBalance() {
        return minimumBalanceAllowed;
    }
    public double GetWithdrawalLimit(){
        return maximumWithdrawalLimit;
    }

}

class PNB extends RBI{
    public int minimumInterestRate = 4;
    public double minimumBalanceAllowed = 1500.0;
    public double maximumWithdrawalLimit = 30000.0; 

    public double GetInterestRate(){
        return minimumInterestRate;
    }
     public double getMinBalance() {
        return minimumBalanceAllowed;
    }
    public double GetWithdrawalLimit(){
        return maximumWithdrawalLimit;
    }

}



public class Main {
    public static void main(String[] args) {
        Customer cus = new Customer("Anandan",21,"95567 4567","6374555018");

        Account acc = new Account(12345677, 3000);

        RBI bank = new ICICI();
        bank.showRBIGuidelines();
        
        System.out.println("\nCustomer: " + cus.name);
        System.out.println("Bank: ICICI");
        System.out.println("Interest Rate: " + bank.GetInterestRate() + "%");
        System.out.println("Minimum Balance Required: " + bank.getMinBalance());
        System.out.println("Max Withdrawal Limit: " + bank.GetWithdrawalLimit()+"\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposite amount: ");
        double amount = sc.nextDouble();
        acc.deposite(amount);

        System.out.print("Enter withdravel amount: ");
        double WithAmount = sc.nextDouble();
        acc.Withdrawal(WithAmount);

        if(acc.Withdrawal(WithAmount)){
            System.out.println("Successfully Withdraw....");
        }else{
            System.out.println("unsuccesfull withdraw...");
        }
        
        System.out.println("Balance: " + acc.getBalance());

    }
}
