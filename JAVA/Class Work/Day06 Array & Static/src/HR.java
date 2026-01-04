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
	HR arr[] = new HR[3];

	arr[0] = new HR();
	arr[1] = new HR(1001,"Yashodeep",60000,5);
	arr[2] = new HR();

	for(int i=0;i<arr.length;i++)
	{
	arr[i].display();
	}

	        
    }
}
