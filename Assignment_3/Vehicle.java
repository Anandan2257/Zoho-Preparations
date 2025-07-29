/*4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, 
such that it can internally keep track of how many vehicles have been created so far, without requiring manual 
counting from outside the class.*/

class Vehicle {
    int vehicleId;
    String brand;
    double price;
    static int count = 0;

    Vehicle(String brand, double price) {
        this.vehicleId = ++count;
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda", 500000);
        Vehicle v2 = new Vehicle("Toyota", 750000);
        Vehicle v3 = new Vehicle("Hyundai", 600000);

        v1.display();
        v2.display();
        v3.display();

        System.out.println("Total Vehicles Created: " + count);
    }
}
