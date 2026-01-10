import java.util.*;

public class Employee1 implements Comparable {

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

	public Employee1(int empId, String name, double salary) {

		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	Employee1() {
		empId = 0;
		name = "Not Assigned";
		salary = 0.0;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]\n";
	}

	// CompareTo
	public int compareTo(Object o) {
		Employee1 e1 = (Employee1) o;
		System.out.println("Inside CompareTo");
		return this.empId - e1.empId;
	}

	// Equals
	@Override
	public boolean equals(Object obj) {

		Employee1 e1 = (Employee1) obj;
		System.out.println("Inside Equals");
		if (this.empId == e1.empId) {
			return true;
		} else {
			return false;
		}
	}

	// HAshCode
	@Override
	public int hashCode() {
		System.out.println("Inside Hashcode");
		return this.empId;
	}

}// Employee1 End here

class Test1 {
	public static void main(String[] a) {

		//ArrayList
		ArrayList<Employee1> l1 = new ArrayList<Employee1>();

		myIdComparater MID = new myIdComparater();
		MySalaryComparator MSC = new MySalaryComparator();
		MyNameComparator MNC = new MyNameComparator();

		l1.add(new Employee1(205, "Shashi", 958));
		l1.add(new Employee1(101, "Yash", 1000));
		l1.add(new Employee1(10, "Yashodeep", 500));


		System.out.println("\n");

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		System.out.println("1.Search by Id ");
		System.out.println("2.Search by Salary");
		System.out.println("3.Search by Name");
		System.out.println("Enter your choice :");

		ch=sc.nextInt();

		switch (ch) {
		case 1: {
			System.out.println("Sort by ID---");
			Collections.sort(l1, MID);
			System.out.println("After \n" + l1);
			System.out.println("\n");
			break;
		}
		case 2: {
			System.out.println("Sort by Salary---");
			Collections.sort(l1, MSC);
			System.out.println("After \n" + l1);
			System.out.println("\n");
			break;
		}
		case 3: {
			System.out.println("Sort by Name---");
			Collections.sort(l1, MNC);
			System.out.println("After \n" + l1);
			System.out.println("\n");

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}

	}
}

class Test2 {
	public static void main(String[] args) {

		// Tree Set
		TreeSet<Employee1> a1 = new TreeSet<Employee1>();
		a1.add(new Employee1(205, "Shashi", 958));
		a1.add(new Employee1(101, "Yash", 1000));
		a1.add(new Employee1(10, "Yashodeep", 500));
		a1.add(new Employee1(151, "RAj", 10));
		a1.add(new Employee1(198, "Akshay", 890));

		
				
		if (a1.contains(new Employee1(10, "Yashodeep", 500))) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}

class Test3 {
	public static void main(String[] args) {

		// HashSet
		HashSet<Employee1> a1 = new HashSet<Employee1>();
		a1.add(new Employee1(205, "Shashi", 958));
		a1.add(new Employee1(101, "Yash", 1000));
		a1.add(new Employee1(10, "Yashodeep", 500));
		a1.add(new Employee1(151, "RAj", 10));
		a1.add(new Employee1(198, "Akshay", 890));

		if (a1.contains(new Employee1(198, "Akshay", 890))) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
