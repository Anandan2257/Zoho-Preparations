package Java_Notes.Inheritance;

public class ElectricScooter extends Vehicle {
    private double battery;

    public ElectricScooter(double distance, double battery) {
        super(distance);
        this.battery = battery;
    }

    @Override
    public void calculateMileage() {
        double mileage = getDistance() / battery;
        System.out.println("Electric Scooter Mileage: " + mileage + " km/kWh");
    }
}
