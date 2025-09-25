package Java_Notes.Inheritance;

public class Vehicle {
    private double distance;

    Vehicle(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void calculateMileage() {
        System.out.println("Calculate mileage for all types of vehicles.");
    }
}
