package annonimusClass;

import java.util.*;

public class Employee implements Comparable<Employee> {

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

class EmployeeTest {
	public static void main(String[] args) {

		ArrayList<Employee> a1 = new ArrayList<Employee>();

		a1.add(new Employee(18, "Virat", 25522));
		a1.add(new Employee(14, "Yash", 25522));
		a1.add(new Employee(12, "Shashi", 84585));
		a1.add(new Employee(19, "Raj", 25871));
		a1.add(new Employee(12, "Vivek", 2684));
		a1.add(new Employee(16, "Akshy", 5874));
		a1.add(new Employee(10, "Yashodeep", 8632));

		Collections.sort(a1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getEmpId() - o2.getEmpId();
			}

		});
		System.out.println("Sort by ID");
		System.out.println(a1);
		System.out.println("\n");

		
		Collections.sort(a1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return (int) (o1.getSalary() - o2.getSalary());
			}

		});
		
		
		System.out.println("Sort by Name");
		System.out.println(a1);
		
		
		Collections.sort(a1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getName().compareTo(o2.getName());
			}

		});
		
		
		System.out.println("Sort by Name");
		System.out.println(a1);
		
		

	}

}