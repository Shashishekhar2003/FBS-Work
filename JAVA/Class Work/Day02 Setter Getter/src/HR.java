class HR {
    int id;
    String name;
    double salary;
    double commission;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setCommission(double c) {
        this.commission = c;
    }
}

class TestHR {
    public static void main(String[] args) {
        HR h1 = new HR();

        h1.setId(201);
        h1.setName("Priya");
        h1.setSalary(60000.0);
        h1.setCommission(5000.0);

        System.out.printf("ID: %d  Name: %s  Salary: %.2f  Commission: %.2f\n", 
                          h1.id, h1.name, h1.salary, h1.commission);
    }
}
