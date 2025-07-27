import java.util.Scanner;

abstract class Ticket{
    String name;
    int age;
    String phoneNumber;
    String fromAddress;
    String toAddress;
    String date;
    String time;

    Ticket(){

    }

    Ticket(String name,int age,String phoneNumber,String fromAddress,String toAddress,String date,String time){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.date = date;
        this.time = time;
    }

    void caluculateAmount(){
        System.out.println("As per the From and To Address");
    }

    void display(){
        System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Phone number: " + phoneNumber +"\n" + "From: " + fromAddress + "\n" + "To: " + toAddress + "\n" + "Date: " + date + "\n" + "Time: " + time );
    }

}

class Bus extends Ticket{

    Bus(String name,int age,String phoneNumber,String fromAddress,String toAddress,String date,String time){
        super(name, age, phoneNumber, fromAddress, toAddress, date, time);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Bus ticket booked successfully");
    }
}

class Train extends Ticket{

    Train(String name,int age,String phoneNumber,String fromAddress,String toAddress,String date,String time){
        super(name, age, phoneNumber, fromAddress, toAddress, date, time);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Train ticket booked successfully");
    }
}

class Flight extends Ticket{

    Flight(String name,int age,String phoneNumber,String fromAddress,String toAddress,String date,String time){
        super(name, age, phoneNumber, fromAddress, toAddress, date, time);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Flight ticket booked successfully");
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: \n 1.Bus \n 2.Train \n 3.Flight");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                Ticket ticket = new Bus("Anandan" , 21, "63xxxxxxx","Namakkal","Chennai","21.06.2025","11:00 PM");
                ticket.display();
                break;
            case 2:
                Ticket ticket1 = new Train("Anandan" , 21, "63xxxxxxx","Namakkal","Chennai","21.06.2025","11:00 PM");
                ticket1.display(); 
                break; 
            case 3:
                Ticket ticket2 = new Flight("Anandan" , 21, "63xxxxxxx","Namakkal","Chennai","21.06.2025","11:00 PM");
                ticket2.display();    
                break; 
        }
        sc.close();
    }
}