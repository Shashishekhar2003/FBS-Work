package model;

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
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]" + "\n";
	}

	@Override
	public int compareTo(Object o) {
		Employee1 e1 = (Employee1) o;

		return this.empId - e1.empId;
	}

}

class Test1 {
	public static void main(String[] a) {

		Employee1 e1 = new Employee1(205, "Shashi", 958);
		Employee1 e2 = new Employee1(101, "Yash", 1000);
		Employee1 e3 = new Employee1(10, "Yashodeep", 500);

		TreeSet l1 = new TreeSet();

		l1.add(e1);
		l1.add(e2);
		l1.add(e3);

		System.out.println(l1);

	}
}