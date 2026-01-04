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

        Admin arr[] = new Admin[3];

	arr[0] = new Admin();
	arr[1] = new Admin(1001,"Yashodeep",60000,5);
	arr[2] = new Admin();

	for(int i=0;i<arr.length;i++)
	{
	arr[i].display();
	}

    }
}
