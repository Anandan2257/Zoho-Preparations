package Java_Notes.Inheritance;

public class Scooter extends Vehicle {
    private double fuelConsumed;

    public Scooter(double distance, double fuelConsumed) {
        super(distance);
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public void calculateMileage() {
        double mileage = getDistance() / fuelConsumed;
        System.out.println("Scooter Mileage: " + mileage + " km/l");
    }
}
