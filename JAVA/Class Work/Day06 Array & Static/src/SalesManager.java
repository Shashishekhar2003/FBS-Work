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

	SalesManager arr[] = new SalesManager[3];

	arr[0] = new SalesManager();
	arr[1] = new SalesManager(1001,"Yashodeep",6000,50000,10);
	arr[2] = new SalesManager();

	for(int i=0;i<arr.length;i++)
	{
	arr[i].display();
	}
        

    }
}
