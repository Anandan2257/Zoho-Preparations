package Java_Notes.Inheritance;

public class ElectricScooter extends Vehicle {
    private double battery; // in kWh

    public ElectricScooter(double distance, double battery) {
        super(distance);
        this.battery = battery;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    @Override
    public void calculateMileage() {
        double mileage = getDistance() / getBattery();
        System.out.println("Electric Scooter Mileage: " + mileage + " km/kWh");
    }
}
