package user;
import Travel.Ticket;
public class User {
    String name;
    int age;
    String phoneNumber;
    String fromAddress;
    String toAddress;
    String date;
    String time;

    public User() {}

    public User(String name, int age, String phoneNumber, String fromAddress, String toAddress, String date, String time) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.date = date;
        this.time = time;
    }

    public void bookTicket(Ticket ticket) {
        System.out.println("----- Ticket Booking Details -----");
        System.out.println("User Name      : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("From           : " + fromAddress);
        System.out.println("To             : " + toAddress);
        System.out.println("Date           : " + date);
        System.out.println("Time           : " + time);
        System.out.println("Ticket ID      : " + ticket.getTicketId());
        System.out.println("Destination    : " + ticket.getDestination());
        System.out.println("Fare           : " + ticket.getFare());
    }
}