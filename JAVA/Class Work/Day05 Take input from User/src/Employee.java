import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.printf("ID: %d  Name: %s  Salary: %.2f\n", id, name, salary);
    }
}

class TestEmployee {
    public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);

        Employee e1 = new Employee();


	System.out.println("Enter Emp ID :");
	int a=sc.nextInt();
	
	sc.nextLine();

	System.out.println("Name :");
	String str=sc.nextLine();


	System.out.println("Salary :");
	double d=sc.nextDouble();


        Employee e2 = new Employee(a,str,d);

        e1.display();
        e2.display();
    }
}
