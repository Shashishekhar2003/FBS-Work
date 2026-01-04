// ================= BASE CLASS ==================

class Appliance {

    String brand;
    int power;   // watts
    static int count = 0;

    Appliance() {
        System.out.println("Appliance Default Constructor called");
        brand = "Not Given";
        power = 0;
        count++;
    }

    Appliance(String brand, int power) {
        System.out.println("Appliance Parameter Constructor called");
        this.brand = brand;
        this.power = power;
        count++;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
    }
}



// ================= DERIVED CLASS 1 ==================

class Fan extends Appliance {

    int speed;

    Fan() {
        super();
        System.out.println("Fan Default Constructor called");
        speed = 0;
    }

    Fan(String brand, int power, int speed) {
        super(brand, power);
        System.out.println("Fan Parameter Constructor called");
        this.speed = speed;
    }

    void display() {
        super.display();
        System.out.println("Speed: " + speed + " RPM");
    }
}



// ================= DERIVED CLASS 2 ==================

class AC extends Appliance {

    double ton;
    String type; // Split/Window

    AC() {
        super();
        System.out.println("AC Default Constructor called");
        ton = 0;
        type = "Not Given";
    }

    AC(String brand, int power, double ton, String type) {
        super(brand, power);
        System.out.println("AC Parameter Constructor called");
        this.ton = ton;
        this.type = type;
    }

    void display() {
        super.display();
        System.out.println("Capacity: " + ton + " Ton");
        System.out.println("Type: " + type);
    }
}



// ================= DERIVED CLASS 3 ==================

class WashingMachine extends Appliance {

    int capacity;
    String mode;

    WashingMachine() {
        super();
        System.out.println("WM Default Constructor called");
        capacity = 0;
        mode = "Not Given";
    }

    WashingMachine(String brand, int power, int capacity, String mode) {
        super(brand, power);
        System.out.println("WM Parameter Constructor called");
        this.capacity = capacity;
        this.mode = mode;
    }

    void display() {
        super.display();
        System.out.println("Capacity: " + capacity + " Kg");
        System.out.println("Mode: " + mode);
    }
}



// ===================== TEST CLASS =====================

class TestAppliance {
    public static void main(String[] args) {

        Fan f1 = new Fan("Bajaj", 60, 1200);
        f1.display();

        System.out.println("\n");

        AC ac1 = new AC("Voltas", 1500, 1.5, "Split");
        ac1.display();

        System.out.println("\n");

        WashingMachine wm1 = new WashingMachine("LG", 500, 7, "Automatic");
        wm1.display();

        System.out.println("\n");

        Appliance a1 = new Appliance();
        a1.display();
    }
}
