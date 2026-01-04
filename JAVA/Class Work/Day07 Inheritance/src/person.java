class Person {

    String name;
    int age;
    static int count = 0;

    Person() {
        System.out.println("Person Default Constructor called");
        name = "Not Given";
        age = 0;
        count++;
    }

    Person(String name, int age) {
        System.out.println("Person Parameter Constructor called");
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}  //Class Person End here



class student extends Person {

    int rollNo;
    String course;

    student() {
        super();
        System.out.println("Student Default Constructor called");
        rollNo = 0;
        course = "Not Given";
    }

    student(String name, int age, int rollNo, String course) {
        super(name, age);
        System.out.println("Student Parameter Constructor called");
        this.rollNo = rollNo;
        this.course = course;
    }

    void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
} //Class Student End Here



class Employee extends Person {

    int empId;
    double salary;

    Employee() {
        super();
        System.out.println("Employee Default Constructor called");
        empId = 0;
        salary = 0;
    }

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        System.out.println("Employee Parameter Constructor called");
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}// class Employee end here


class Player extends Person {

    String game;
    int rank;

    Player() {
        super();
        System.out.println("Player Default Constructor called");
        game = "Not Given";
        rank = 0;
    }

    Player(String name, int age, String game, int rank) {
        super(name, age);
        System.out.println("Player Parameter Constructor called");
        this.game = game;
        this.rank = rank;
    }

    void display() {
        super.display();
        System.out.println("Game: " + game);
        System.out.println("Rank: " + rank);
    }
} //Class Player end here


class TestPerson {
    public static void main(String[] args) {

        student s1 = new student("Yash", 21, 101, "Computer Engg");
        s1.display();

        System.out.println("\n");

//        Employee e1 = new Employee("Shashi", 25, 501, 45000);
//        e1.display();

        System.out.println("\n");

        Player p1 = new Player("Rohit", 30, "Cricket", 1);
        p1.display();

        System.out.println("\n");

        Person p2 = new Person();
        p2.display();
    }
}
