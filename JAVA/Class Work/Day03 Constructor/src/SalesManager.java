class SalesManager {
    int id;
    String name;
    double incentive;
    double salary;
    double target;

    SalesManager() {
        id = 0;
        name = "Not Assigned";
        incentive = 0.0;
        salary = 0.0;
        target = 0.0;
    }

    SalesManager(int i, String n, double inc, double s, double t) {
        id = i;
        name = n;
        incentive = inc;
        salary = s;
        target = t;
    }

    void display() {
        System.out.printf("ID: %d  Name: %s  Incentive: %.2f  Salary: %.2f  Target: %.2f\n",
                          id, name, incentive, salary, target);
    }
}

class TestSalesManager {
    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager();
        SalesManager sm2 = new SalesManager(401, "Sneha", 8000.0, 70000.0, 100000.0);

        sm1.display();
        sm2.display();
    }
}
