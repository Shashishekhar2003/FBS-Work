import java.util.Scanner;

abstract class ElectricityBill {
	double units;
	String customerName;
	
	// Getter & Setter
	public double getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	// PArameterConstructer
	public ElectricityBill(Double units, String customerName) {
		this.units = units;
		this.customerName = customerName;
	}
	
	void showUsage() {
		System.out.println("• customerName : " + customerName);
		System.out.println("• Units : " + units);
		
	}
	
	//Abstract Method
	abstract double calculateBill();
	
	final void generateBill() {
		
		double amount = calculateBill();
		double tax = amount * 0.05;  //0.5% Tax
		double fixCharge = 50;
		double finalBill = amount + tax + fixCharge;
		
		System.out.println("Base Amount : " + amount);
		System.out.println("Tax :" + tax);
		System.out.println("Fix Charge : " + fixCharge);
		System.out.println("---------------------------");
		System.out.println("Final Bill Amount := " + finalBill);
	
	}

} // Class ElectricityBill End here


class ResidentialBill extends ElectricityBill{

	//ParameterConstructer
	public ResidentialBill(Double units, String customerName) {
		super(units, customerName);
	}
	

	@Override
	double calculateBill() {
	    double bill = 0;

	    if (units <= 100) {
	        bill = units * 2.5;
	    } else if (units <= 300) {
	        bill = (100 * 2.5) + (units - 100) * 3.5;
	    } else {
	        bill = (100 * 2.5) + (200 * 3.5) + (units - 300) * 5;
	    }

	    if (units > 500) {
	        bill += 150;
	    }

	    return bill;
	}

	
}  //Class ResidentialBill End here

class CommercialBill extends ElectricityBill {

	CommercialBill(Double units, String customerName) {
		super(units, customerName);
		
	}
	
	@Override
	double calculateBill() {
		
		double charge = 6.5;
		double bill =units*charge;
		
		if (units < 200 && bill < 1500) {
            bill = 1500;
        }
		else if(units>1000) {
			double superCharge = bill*0.08;
			bill=bill+superCharge;
		}
		
		return bill;
	}
} // Class CommercialBill End here


class TestBill{
	public static void main(String [] a) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Select the type of Customer :");
	System.out.println("1. Residential ");
	System.out.println("2. Commercial ");
	System.out.println("Enter Type :");
	int ch = sc.nextInt();
	sc.nextLine();//to clear buffer
	
	System.out.println("Enter Name :");
	String Name = sc.nextLine();
	
	System.out.println("Enter Units :");
	int units = sc.nextInt();
	
	ElectricityBill E1 = null;
	
	if(ch==1) {
//		E1 = new ResidentialBill(Name,units);
		E1 = new ResidentialBill((double)units, Name);

	}
	else if(ch==2) {
//		E1 = new CommercialBill(Name,units);
		E1 = new CommercialBill((double)units, Name);

	}
	else {
        System.out.println("Invalid Choice!");
        return;
	}
	
	System.out.println("================BILL DETAILS================");
	E1.generateBill();
	
	
}
}
