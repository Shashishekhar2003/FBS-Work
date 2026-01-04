class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.printf("ID: %d  Name: %s  Salary: %.2f\n", id, name, salary);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Yash", 50000.0);

        e1.display();
        e2.display();
    }
}
