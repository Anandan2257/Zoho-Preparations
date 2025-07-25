class Vehicle {
    int mileage;
    double price;

    Vehicle() {
        mileage = 0;
        price = 0.0;
    }

    Vehicle(int mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }
}

class Car extends Vehicle {
    double ownershipCost1;
    int warranty; 
    int seatingCapacity;
    String fuelType;

    Car() {
        super();
    }

    Car(int mileage, double price, double ownershipCost1, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price);
        this.ownershipCost1 = ownershipCost1;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
}

class Bike extends Vehicle {
    int numberOfCylinders;
    int numberOfGears;
    String coolingType;
    String wheelType;
    int fuelTankSize;

    Bike() {
        super();
    }

    Bike(int mileage, double price, int cylinders, int gears, String coolingType, String wheelType, int tankSize) {
        super(mileage, price);
        this.numberOfCylinders = cylinders;
        this.numberOfGears = gears;
        this.coolingType = coolingType;
        this.wheelType = wheelType;
        this.fuelTankSize = tankSize;
    }
}

class Audi extends Car {
    String modelType;

    Audi(String modelType, int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Audi Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost1);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " kmpl");
        System.out.println("Price: Rs." + price);
    }
}

class Ford extends Car {
    String modelType;

    Ford(String modelType, int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Ford Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost1);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " kmpl");
        System.out.println("Price: Rs." + price);
    }
}

class Bajaj extends Bike {
    String makeType;

    Bajaj(String makeType, int mileage, double price, int cylinders, int gears, String coolingType, String wheelType, int tankSize) {
        super(mileage, price, cylinders, gears, coolingType, wheelType, tankSize);
        this.makeType = makeType;
    }

    void display() {
        System.out.println("Bajaj Make Type: " + makeType);
        System.out.println("Cylinders: " + numberOfCylinders);
        System.out.println("Gears: " + numberOfGears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " L");
        System.out.println("Mileage: " + mileage + " kmpl");
        System.out.println("Price: Rs." + price);
    }
}

class TVS extends Bike {
    String makeType;

    TVS(String makeType, int mileage, double price, int cylinders, int gears, String coolingType, String wheelType, int tankSize) {
        super(mileage, price, cylinders, gears, coolingType, wheelType, tankSize);
        this.makeType = makeType;
    }

    void display() {
        System.out.println("TVS Make Type: " + makeType);
        System.out.println("Cylinders: " + numberOfCylinders);
        System.out.println("Gears: " + numberOfGears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " L");
        System.out.println("Mileage: " + mileage + " kmpl");
        System.out.println("Price: Rs." + price);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("_________Car Details____________");
        Audi a1 = new Audi("A6", 15, 5500000, 120000, 5, 5, "Petrol");
        a1.display();

        System.out.println("_________Bike Details____________");
        Bajaj b1 = new Bajaj("Pulsar NS200", 40, 120000, 1, 5, "Liquid", "Alloys", 12);
        b1.display();
    }     
}    