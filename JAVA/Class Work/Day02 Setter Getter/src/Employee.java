class Employee {
    int id;
    String name;
    double salary;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setId(101);
        e1.setName("Yash");
        e1.setSalary(50000.0);

        System.out.printf("ID: %d  Name: %s  Salary: %.2f\n", e1.id, e1.name, e1.salary);
    }
}
