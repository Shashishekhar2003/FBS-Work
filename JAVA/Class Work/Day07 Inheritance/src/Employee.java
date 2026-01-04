// ================= BASE CLASS ==================

class Employee {

    int empId;
    String name;
    double salary;
    static int count = 0;

    Employee() {
        System.out.println("Employee Default Constructor called");
        empId = 0;
        name = "Not Given";
        salary = 0.0;
        count++;
    }

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

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }
}



// ================= DERIVED CLASS 1 (HR) ==================

class HR extends Employee {

    String department;
    int hiringCount;

    HR() {
        super();
        System.out.println("HR Default Constructor called");
        department = "Not Given";
        hiringCount = 0;
    }

    HR(int empId, String name, double salary, String department, int hiringCount) {
        super(empId, name, salary);
        System.out.println("HR Parameter Constructor called");
        this.department = department;
        this.hiringCount = hiringCount;
    }

    void display() {
        super.display();
        System.out.println("Department  : " + department);
        System.out.println("Hiring Count: " + hiringCount);
    }
}



// ================= DERIVED CLASS 2 (ADMIN) ==================

class Admin extends Employee {

    String shift;
    String area;

    Admin() {
        super();
        System.out.println("Admin Default Constructor called");
        shift = "Not Given";
        area = "Not Given";
    }

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



// ================= DERIVED CLASS 3 (SALES MANAGER) ==================

class SalesManager extends Employee {

    double target;
    double achievedSales;

    SalesManager() {
        super();
        System.out.println("SalesManager Default Constructor called");
        target = 0.0;
        achievedSales = 0.0;
    }

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



// ===================== TEST CLASS =====================

class TestEmployee {
    public static void main(String[] args) {

   
    	Employee e1;
    	e1 = new Employee(101,"Yash",25220);
    	e1.display();
    	
    	e1 = new SalesManager(102,"Yashodeep",5842,2,5);
    	e1.display();
    	
    	e1 = new Admin(105,"Vivek",2500,"Morning","All");
    	e1.display();
    	
    }
}
