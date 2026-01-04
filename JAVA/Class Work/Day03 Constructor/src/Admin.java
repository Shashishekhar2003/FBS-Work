class Admin {
    int id;
    String name;
    double salary;
    double allowance;

    Admin() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
        allowance = 0.0;
    }

    Admin(int i, String n, double s, double a) {
        id = i;
        name = n;
        salary = s;
        allowance = a;
    }

    void display() {
        System.out.printf("ID: %d  Name: %s  Salary: %.2f  Allowance: %.2f\n", id, name, salary, allowance);
    }
}

class TestAdmin {
    public static void main(String[] args) {
        Admin a1 = new Admin();
        Admin a2 = new Admin(301, "Rohan", 55000.0, 3000.0);

        a1.display();
        a2.display();
    }
}
