class Shape {

    String shapeName;
    String color;
    static int count = 0;

    // Default Constructor
    Shape() {
        System.out.println("Shape Default Constructor called");
        shapeName = "Not Given";
        color = "Not Given";
        count++;
    }

    // Parameterized Constructor
    Shape(String shapeName, String color) {
        System.out.println("Shape Parameter Constructor called");
        this.shapeName = shapeName;
        this.color = color;
        count++;
    }

    // Getters & Setters
    String getShapeName() {
        return shapeName;
    }

    void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    void display() {
        System.out.println("Shape Name: " + this.shapeName);
        System.out.println("Color: " + this.color);
    }
}



// =================== DERIVED CLASS 1 (CIRCLE) ====================

class Circle extends Shape {

    double radius;

    Circle() {
        super();
        System.out.println("Circle Default Constructor called");
        radius = 0.0;
    }

    Circle(String shapeName, String color, double radius) {
        super(shapeName, color);
        System.out.println("Circle Parameter Constructor called");
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}



// =================== DERIVED CLASS 2 (RECTANGLE) ====================

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle() {
        super();
        System.out.println("Rectangle Default Constructor called");
        length = 0.0;
        width = 0.0;
    }

    Rectangle(String shapeName, String color, double length, double width) {
        super(shapeName, color);
        System.out.println("Rectangle Parameter Constructor called");
        this.length = length;
        this.width = width;
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}



// =================== DERIVED CLASS 3 (TRIANGLE) ====================

class Triangle extends Shape {

    double base;
    double height;

    Triangle() {
        super();
        System.out.println("Triangle Default Constructor called");
        base = 0.0;
        height = 0.0;
    }

    Triangle(String shapeName, String color, double base, double height) {
        super(shapeName, color);
        System.out.println("Triangle Parameter Constructor called");
        this.base = base;
        this.height = height;
    }

    double getBase() {
        return base;
    }

    void setBase(double base) {
        this.base = base;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void display() {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}



// =================== TEST CLASS ====================

class TestShape {
    public static void main(String[] args) {

        Circle c1 = new Circle("Circle", "Red", 5.5);
        c1.display();

        System.out.println("\n");

        Rectangle r1 = new Rectangle("Rectangle", "Blue", 10, 4);
        r1.display();

        System.out.println("\n");

        Triangle t1 = new Triangle("Triangle", "Green", 6, 8);
        t1.display();

        System.out.println("\n");

        Shape s1 = new Shape();
        s1.display();
    }
}
