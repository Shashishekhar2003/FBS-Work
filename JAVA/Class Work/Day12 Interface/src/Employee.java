//CLass Cast Exception = to avoid this use insanceof


class Employee {

    int empId;
    String name;
    double salary;
    static int count = 0;

    // Default Constructor
    Employee() {
        System.out.println("Employee Default Constructor called");
        empId = 0;
        name = "Not Given";
        salary = 0.0;
        count++;
    }

    //Parameter Constructor
    Employee(int empId, String name, double salary) {
        System.out.println("Employee Parameter Constructor called");
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        count++;
    }

    // Getters & Setters
    int getEmpId() {
        return empId;
    }

    void setEmpId(int empId) {
        this.empId = empId;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }
    
    //calculate salary
    double calSal() {
    	return this.salary;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }
} // Base Class Employee End here 


class HR extends Employee {

    String department;
    int hiringCount;
    double allowance;
    
    

    public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getHiringCount() {
		return hiringCount;
	}

	public void setHiringCount(int hiringCount) {
		this.hiringCount = hiringCount;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	//Default Constructor
    HR() {
        super();
        System.out.println("HR Default Constructor called");
        department = "Not Given";
        hiringCount = 0;
        allowance = 0;
    }

    //Parameter Constructor
    HR(int empId, String name, double salary, String department, int hiringCount , double allowance) {
        super(empId, name, salary);
        System.out.println("HR Parameter Constructor called");
        this.department = department;
        this.hiringCount = hiringCount;
        this.allowance = allowance;
    }

    //calculate salary
    double calSal() {
    	return this.salary+allowance;
    }
    
    void display() {
        super.display();
        System.out.println("Department  : " + department);
        System.out.println("Hiring Count: " + hiringCount);
        System.out.println("allowance   : " + allowance);
    }
}
//HR class end here


class Admin extends Employee {

    String shift;
    String area;

    //Default Constructor
    Admin() {
        super();
        System.out.println("Admin Default Constructor called");
        shift = "Not Given";
        area = "Not Given";
    }

    //Parameter Constructor
    Admin(int empId, String name, double salary, String shift, String area) {
        super(empId, name, salary);
        System.out.println("Admin Parameter Constructor called");
        this.shift = shift;
        this.area = area;
    }

    void display() {
        super.display();
        System.out.println("Shift       : " + shift);
        System.out.println("Area        : " + area);
    }
}
// admin class end here


class SalesManager extends Employee {

    double target;
    double achievedSales;
    
    

    public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}

	public double getAchievedSales() {
		return achievedSales;
	}

	public void setAchievedSales(double achievedSales) {
		this.achievedSales = achievedSales;
	}

	//Default Constructor
    SalesManager() {
        super();
        System.out.println("SalesManager Default Constructor called");
        target = 0.0;
        achievedSales = 0.0;
    }

    //Parameter Constructor
    SalesManager(int empId, String name, double salary, double target, double achievedSales) {
        super(empId, name, salary);
        System.out.println("SalesManager Parameter Constructor called");
        this.target = target;
        this.achievedSales = achievedSales;
    }

    void display() {
        super.display();
        System.out.println("Sales Target    : " + target);
        System.out.println("Achieved Sales  : " + achievedSales);
    }
}
//SalesManager class end here


class TestEmployee {
    public static void main(String[] args) {

   
    	Employee E1;
    	E1 = new SalesManager(102,"Yashodeep",5842,2,5);
    	TestEmployee.giveBonus(E1);
    	
    	E1 = new HR(100,"Shashi",50000,"H R",10,500);
    	
    	TestEmployee.giveBonus(E1);
    	
    	
    	
    }
    
    //setTarget & setAllowance are specialize function 
    static void giveBonus(Employee E1) {
    	if(E1 instanceof SalesManager) {
    		SalesManager S1 = (SalesManager) E1;
    		S1.setTarget(1111);
    		S1.display();
    	}
    	System.out.println("\n");
    	if(E1 instanceof HR) {
    		HR H1 = (HR) E1;
    		H1.setAllowance(123456);
    		H1.display();
    	}
    }
}

