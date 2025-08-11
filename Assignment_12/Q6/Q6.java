/*Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM machine, where 
create thread to check the PIN number, another thread to perform the cash withdrawal, another 
one to check the balance amount and print the receipt. */

import java.util.*;
class ATM{
    double balance = 10000;
    boolean verified = false;

    public synchronized void checkATM(int pin){
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }
        if(pin == 1234){
            verified = true;
            System.out.println("Pin verified Successfully..");
        }else{
            verified = false;
            System.out.println("Invalid");
        }
        notifyAll();
    }

    public synchronized void withdrawal(double withdrawalAmount){
        while(!verified){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        if(balance >= withdrawalAmount){
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successfully: " + withdrawalAmount);
        }else{
            System.out.println("Unsufficient balance");
        }
        notifyAll();
    }

     public synchronized void checkBalance() {
        while (!verified) {
            try { 
                wait();
            } catch (InterruptedException e) 
            { 
                System.out.println(e); 
            }
        }
        System.out.println("Current Balance:" + balance);
        notifyAll();
    }

    public synchronized void display(){
        while(!verified){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Printing receipt... Thank you for banking with us!");
    }
}

class checkATM implements Runnable{
    ATM atm;

    checkATM(ATM atm){
        this.atm = atm;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        atm.checkATM(pin);
    }
}

class withdrawal implements Runnable{
    ATM atm;

    withdrawal(ATM atm){
        this.atm = atm;
    }
    
    public void run(){
        atm.withdrawal(6550);;
    }
}


class checkBalance implements Runnable{
    ATM atm;

    checkBalance(ATM atm){
        this.atm = atm;
    }

    public void run(){
        atm.checkBalance();
    }
}

class display implements Runnable{
    ATM atm;

    display(ATM atm){
        this.atm = atm;
    }

    public void run(){
        atm.display();
    }
}
public class Q6 {
    public static void main(String[] args) {
       ATM atm = new ATM();
       checkATM check = new checkATM(atm);
       Thread t1 = new Thread(check);

       withdrawal wd = new withdrawal(atm);
       Thread t2 = new Thread(wd);


        checkBalance cb = new checkBalance(atm);
       Thread t3 = new Thread(cb);


       display dis = new display(atm);
       Thread t4 = new Thread(dis);

       t1.start();
       t2.start();
       t3.start();
       t4.start();

    }
}
