class HR {
    int id;
    String name;
    double salary;
    double commission;

    HR() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
        commission = 0.0;
    }

    HR(int i, String n, double s, double c) {
        id = i;
        name = n;
        salary = s;
        commission = c;
    }

    void display() {
        System.out.printf("ID: %d  Name: %s  Salary: %.2f  Commission: %.2f\n", id, name, salary, commission);
    }
}

class TestHR {
    public static void main(String[] args) {
        HR h1 = new HR();
        HR h2 = new HR(201, "Priya", 60000.0, 5000.0);

        h1.display();
        h2.display();
    }
}
