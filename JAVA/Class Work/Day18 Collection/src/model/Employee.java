package model;
import java.util.*;

class Employee {

	int empId;
	String name;
	double salary;

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
		super();
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
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]" +"\n";
	}
	
	

}



class Test{
	public static void main(String [] a) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(101,"Yash",9846984);
		Employee e3 = new Employee(102,"Yashodeep",85246);
		
		
		List L1 = new LinkedList();
		
		L1.add(e1);
		L1.add(e2);
		L1.add(e2);
		
		System.out.println(L1);
	}
}