class Student {
	int rollno;
	String name;
	double percentage;

	// Setter and Getter
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	//Parameter constructer
	void setStudent(int r, String n, double p) {
		this.rollno = r;
		this.name = n;
		this.percentage = p;
	}
} // Class Student End here


class Employee {
	int id;
	String name;
	double annualSalary;

	// setter and getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	void setEmployee(int i, String n, double s) {
		this.id = i;
		this.name = n;
		this.annualSalary = s;
	}
} // class employee end here


class Bank {

	void approveLoan(Student s) // Overloaded method for Student
	{
		System.out.println("Loan approval for Student: " + s.name);

		if (s.percentage > 80)
			System.out.println("Approved Loan: 2 Lakh");

		else if (s.percentage >= 60)
			System.out.println("Approved Loan: 1 Lakh");

		else if (s.percentage >= 40)
			System.out.println("Approved Loan: 50K");

		else
			System.out.println("No Loan Approved");
	}

	void approveLoan(Employee e) // Overloaded method for Employee
	{
		System.out.println("Loan approval for Employee: " + e.name);
		if (e.annualSalary > 12)
			System.out.println("Approved Loan: 7 Lakh");

		else if (e.annualSalary >= 10)
			System.out.println("Approved Loan: 6 Lakh");

		else if (e.annualSalary >= 6)
			System.out.println("Approved Loan: 5 Lakh");

		else if (e.annualSalary >= 4)
			System.out.println("Approved Loan: 4 Lakh");

		else
			System.out.println("No Loan Approved");
	}
}

class TestBank {
	public static void main(String[] args) {
		Student s1 = new Student();
		Employee e1 = new Employee();

		Bank b = new Bank();
		s1.setStudent(1, "Amit", 78.5);
		e1.setEmployee(101, "Rohan", 11.2);

		b.approveLoan(s1);
		System.out.println();
		b.approveLoan(e1);
	}
}