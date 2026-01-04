class SalesManager {
    int id;
    String name;
    double incentive;
    double salary;
    double target;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setIncentive(double inc) {
        this.incentive = inc;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setTarget(double t) {
        this.target = t;
    }
}

class TestSalesManager {
    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager();

        sm1.setId(401);
        sm1.setName("Sneha");
        sm1.setIncentive(8000.0);
        sm1.setSalary(70000.0);
        sm1.setTarget(100000.0);

        System.out.printf("ID: %d  Name: %s  Incentive: %.2f  Salary: %.2f  Target: %.2f\n", 
                          sm1.id, sm1.name, sm1.incentive, sm1.salary, sm1.target);
    }
}
