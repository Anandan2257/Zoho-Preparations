package Java_Notes.Inheritance;

public class Bike extends Vehicle {
    private double fuelConsumed;

    public Bike(double distance, double fuelConsumed) {
        super(distance);
        this.fuelConsumed = fuelConsumed;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public void setFuelConsumed(double fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public void calculateMileage() {
        double mileage = getDistance() / getFuelConsumed();
        System.out.println("Bike Mileage: " + mileage + " km/l");
    }
}
