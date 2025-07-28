import java.util.Scanner;

interface PaymentMethod{
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    @Override
    public void pay(double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        cardNumber = sc.nextLine();
        System.out.print("Enter Card Holder Name: ");
        cardHolderName = sc.nextLine();
        System.out.print("Enter Expiry Date : ");
        expiryDate = sc.nextLine();
        System.out.println("Paid " + amount + " using Credit Card ");
    }

}

class DebitCardPayment implements PaymentMethod{
    private String cardNumber;
    private String bankName;

    @Override
    public void pay(double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Debit Card Number: ");
        cardNumber = sc.nextLine();
        System.out.print("Enter Bank Name: ");
        bankName = sc.nextLine();
        System.out.println("Paid " + amount + " using Debit Card from " + bankName);
    }

}

class UPIPayment implements PaymentMethod{
    private String upiId;

    @Override
    public void pay(double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UPI ID: ");
        upiId = sc.nextLine();
        System.out.println("Paid " + amount + " using UPI ID: " + upiId);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        switch (choice) {
            case 1:
                CreditCardPayment obj1 = new CreditCardPayment();
                obj1.pay(amount);
                break;
            case 2:
                DebitCardPayment obj2 = new DebitCardPayment();
                obj2.pay(amount);
            case 3:
                UPIPayment obj3 = new UPIPayment();
                obj3.pay(amount);    
            default:
                break;
        }
    }
}
