// ================= BASE CLASS ==================

class Shape {

    String shapeName;
    String color;
    static int count = 0;

    // Default Constructor
    Shape() {
        System.out.println("Shape Default Constructor called");
        this.shapeName = "Not Given";
        this.color = "Not Given";
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

  //  void display() {
   //     System.out.println("Shape Name: " + this.shapeName);
     //   System.out.println("Color: " + this.color);
    //}
    
    public String toString() {
    	return "Shape Name :" + this.shapeName + "\n" + "Color" + this.color;
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

    //Cal Area
    double Area() {
    	return 3.14*radius*radius;
    }
    
   /* void display() {
        super.display();
        System.out.println("Radius: " + radius);
    } */
    public String toString() {
    	return super.toString() + "\n" +  "Radius: " + radius;
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
    
    //Cal Area
    double Area() {
    	return length*width;
    }

    /*void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    } */
    public String toString() {
    	return super.toString() + "Length: " + length + "\n" + "Width: " + width;
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
    
    //Cal Area
    double Area() {
    	return base * height / 2;
    }

    /*void display() {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    } */
    public String toString() {
    	return super.toString() + "Base: " + base + "\n" + "Height: " + height;
    }
}



// =================== TEST CLASS ====================

class TestShape {
    public static void main(String[] args) {

        Circle c1 = new Circle("Circle", "Red", 5.5);
        System.out.println(c1.toString());

        System.out.println("Area is:" + c1.Area());

        System.out.println("\n");

        Rectangle r1 = new Rectangle("Rectangle", "Blue", 10, 4);
        System.out.println(r1.toString());
        System.out.println("Area is:" + r1.Area());

        System.out.println("\n");

        Triangle t1 = new Triangle("Triangle", "Green", 6, 8);
        System.out.println(t1.toString());
        System.out.println("Area is:" + t1.Area());

        System.out.println("\n");

        Shape s1 = new Shape();
        System.out.println(s1.toString());
    }
}


