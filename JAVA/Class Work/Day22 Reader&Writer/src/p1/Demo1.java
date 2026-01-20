package p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Employee {
	int ID;
	String Name;
	double Salary;

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

}
//Employee Class End here

public class Demo1 {

	public static void main(String[] args) throws IOException {

		ArrayList<Employee> emplist = new ArrayList<Employee>();

		FileReader FR = new FileReader("Demo.txt");
		BufferedReader BR = new BufferedReader(FR);

		String str;
		str = BR.readLine();
		String[] res = str.split(",");

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();

		while ((str = BR.readLine()) != null) {

			String[] res1 = str.split(",");

			Employee emp = new Employee();
			
			emp.ID=Integer.parseInt(res1[0]);
			emp.Name=res1[1];
			emp.Salary=Double.parseDouble(res1[2]);

			emplist.add(emp);
			
		
			
			for(Employee e : emplist) {
				System.out.println(e);
			}
			
			
		}
//			for (int i = 0; i < res.length; i++) {
//				System.out.print(res1[i] + " ");
//
//			}
			
			
		
		BR.close();

	}

}
