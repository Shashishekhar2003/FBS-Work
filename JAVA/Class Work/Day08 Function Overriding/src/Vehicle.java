// ================= BASE CLASS ==================

class Vehicle {

    int vehicleNo;
    String brand;
    int mileage;
    static int count = 0;

    // Default Constructor
    Vehicle() {
        System.out.println("Vehicle Default Constructor called");
        vehicleNo = 0;
        brand = "Not Given";
        mileage = 0;
        count++;
    }

    // Parameterised Constructor
    Vehicle(int vehicleNo, String brand, int mileage) {
        System.out.println("Vehicle Param Constructor called");
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.mileage = mileage;
        count++;
    }

    // Getter & Setter
    int getVehicleNo() {
        return vehicleNo;
    }

    void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    int getMileage() {
        return mileage;
    }

    void setMileage(int mileage) {
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Brand: " + brand);
        System.out.println("Mileage: " + mileage);
    }

}


// ================== DERIVED CLASS 1 (CAR) ==================

class Car extends Vehicle {

    String color;
    String model;

    Car() {
        super();
        System.out.println("Car Default Constructor called");
        color = "Not Given";
        model = "Not Given";
    }

    Car(int vehicleNo, String brand, int mileage, String color, String model) {
        super(vehicleNo, brand, mileage);
        System.out.println("Car Param Constructor called");
        this.color = color;
        this.model = model;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }
}



// ================== DERIVED CLASS 2 (BIKE) ==================

class Bike extends Vehicle {

    int engineCC;
    String type; // Sports / Cruiser / Electric etc.

    Bike() {
        super();
        System.out.println("Bike Default Constructor called");
        engineCC = 0;
        type = "Not Given";
    }

    Bike(int vehicleNo, String brand, int mileage, int engineCC, String type) {
        super(vehicleNo, brand, mileage);
        System.out.println("Bike Param Constructor called");
        this.engineCC = engineCC;
        this.type = type;
    }

    void display() {
        super.display();
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Type: " + type);
    }
}



// ================== DERIVED CLASS 3 (TRUCK) ==================

class Truck extends Vehicle {

    int loadCapacity; // in tons
    String companyUse; // Logistics, Construction etc.

    Truck() {
        super();
        System.out.println("Truck Default Constructor called");
        loadCapacity = 0;
        companyUse = "Not Given";
    }

    Truck(int vehicleNo, String brand, int mileage, int loadCapacity, String companyUse) {
        super(vehicleNo, brand, mileage);
        System.out.println("Truck Param Constructor called");
        this.loadCapacity = loadCapacity;
        this.companyUse = companyUse;
    }

    void display() {
        super.display();
        System.out.println("Load Capacity: " + loadCapacity + " Tons");
        System.out.println("Company Use: " + companyUse);
    }
}



// ===================== TEST CLASS =========================

class TestVehicle {
    public static void main(String[] args) {

        Car c1 = new Car(101, "Honda", 45, "Red", "City");
        c1.display();

        System.out.println("\n");

        Bike b1 = new Bike(201, "Yamaha", 40, 150, "Sports");
        b1.display();

        System.out.println("\n");

        Truck t1 = new Truck(301, "Tata", 20, 15, "Logistics");
        t1.display();

        System.out.println("\n");

        Vehicle v1 = new Vehicle();
        v1.display();
    }
}
