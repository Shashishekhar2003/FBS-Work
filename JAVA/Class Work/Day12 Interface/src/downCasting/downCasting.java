package downCasting;

class employee {

	int id;
	String name;
	int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Parameter Constructor
	public employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.print(this.id + "|" + this.name + "|" + this.salary);
	}

}
//Employee End here

class admin extends employee {

	int allowance;

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	// Parameter Constructor
	public admin(int id, String name, int salary, int allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	void display() {
		super.display();
		System.out.print("|" + this.allowance);
	}

}
//ADMIN End here

class Test1 {
	public static void main(String[] args) {
		employee e1;

		Test1.giveBonus(new admin(101, "Yash", 5000, 0));

	}

	static void giveBonus(employee e1) {

		if (e1 instanceof admin) {
			admin a1 = (admin) e1;
			a1.setAllowance(12);
			e1.display();
		}
	}

}