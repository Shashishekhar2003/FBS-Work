import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
    static double bonus;

    //Static block for initialize static variable
    static {
    	bonus=10;
    }  //static block end 
    
    // Default constructor
    Employee() {
	System.out.println("Default constructor is called");
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int i, String n, double s) {
	System.out.println("Paratemerized constructor is called");

        id = i;
        name = n;
        salary = s;
    }

    void display() {
    	System.out.println("ID = " + id);
    	System.out.println("Name = " + name);
    	System.out.println("Salary = " + salary);
    	System.out.println("Bonus = " + bonus);
    }
} //class Employee end here


class TestEmployee {
    public static void main(String[] args) 
{
	Employee arr[] = new Employee[3];

	arr[0] = new Employee();
	arr[1] = new Employee(101,"yash",5000);
	arr[2] = new Employee(102,"Shashi",8000);

	for(int i=0;i<arr.length;i++)
	{
	arr[i].display();
	System.out.println("\n");
	}



}
}
