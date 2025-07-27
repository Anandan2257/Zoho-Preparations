public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(101, "Chennai", 1200.0);
        User user = new User("Anandan", 22, "9876543210", "Salem", "Chennai", "2025-08-01", "10:30 AM");

        user.bookTicket(ticket);
    }
}