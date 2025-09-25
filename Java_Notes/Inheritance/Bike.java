package Java_Notes.Inheritance;

public class Bike extends Vehicle {
    private double fuelConsumed;

    public Bike(double distance, double fuelConsumed) {
        super(distance);
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public void calculateMileage() { 
        double mileage = getDistance() / fuelConsumed;
        System.out.println("Bike Mileage: " + mileage + " km/l");
    }
}
