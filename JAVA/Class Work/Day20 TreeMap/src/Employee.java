import java.util.*;

public class Employee implements Comparable <Employee>{

	int empId;
	String name;
	double salary;

	// Setter & Getter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empId, String name, double salary) {

		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	Employee() {
		empId = 0;
		name = "Not Assigned";
		salary = 0.0;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]\n";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Test {
	public static void main(String[] args) {

		TreeMap<MyKey, Employee> tm1 = new TreeMap<MyKey, Employee>();

		tm1.put(new MyKey(18), new Employee(18, "Virat", 25522));
		tm1.put(new MyKey(14), new Employee(14, "Yash", 25522));
		tm1.put(new MyKey(12), new Employee(12, "Shashi", 84585));
		tm1.put(new MyKey(19), new Employee(19, "Raj", 25871));
		tm1.put(new MyKey(12), new Employee(12, "Vivek", 2684));
		tm1.put(new MyKey(16), new Employee(16, "Akshy", 5874));
		tm1.put(new MyKey(10), new Employee(10, "Yashodeep", 8632));

		
		//System.out.println(tm1);
		
		if (tm1.containsKey(new MyKey(10))) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		
	

	}

}