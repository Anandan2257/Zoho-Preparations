package Java_Notes.Inheritance;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(200, 5);                
        Scooter scooter = new Scooter(150, 3);       
        ElectricScooter eScooter = new ElectricScooter(100, 2.5);

        bike.calculateMileage();
        scooter.calculateMileage();
        eScooter.calculateMileage();
    }
}
