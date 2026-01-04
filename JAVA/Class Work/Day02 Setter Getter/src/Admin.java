class Admin {
    int id;
    String name;
    double salary;
    double allowance;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setAllowance(double a) {
        this.allowance = a;
    }
}

class TestAdmin {
    public static void main(String[] args) {
        Admin a1 = new Admin();

        a1.setId(301);
        a1.setName("Rohan");
        a1.setSalary(55000.0);
        a1.setAllowance(3000.0);

        System.out.printf("ID: %d  Name: %s  Salary: %.2f  Allowance: %.2f\n", 
                          a1.id, a1.name, a1.salary, a1.allowance);
    }
}
