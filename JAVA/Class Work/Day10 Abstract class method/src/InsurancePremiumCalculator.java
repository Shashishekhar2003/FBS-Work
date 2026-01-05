import java.util.Scanner;

abstract class Insurance {
	
	String policyHolderName;
	double basePremium;
	
	// Setter & Getter
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getBasePremium() {
		return basePremium;
	}
	public void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}
	
	//ParameterConstructer
	public Insurance(String policyHolderName, double basePremium) {
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}
	
	
	abstract double calculatePremium();
	
	void printPolicyDetails() {
		
		System.out.println("=========================================");
		System.out.println("• Policy Holder Name :" + policyHolderName);
		System.out.println("• Base Premium Rs :" + basePremium);
		System.out.println(" Final Premium RS :" + calculatePremium());
		System.out.println("=========================================");
	}
	
} // Base class end here

class CarInsurance extends Insurance {
	
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue ;
	
	// Setter & getter
	public int getCarAgeInYears() {
		return carAgeInYears;
	}
	public void setCarAgeInYears(int carAgeInYears) {
		this.carAgeInYears = carAgeInYears;
	}
	public boolean isHadAccidentInLastYear() {
		return hadAccidentInLastYear;
	}
	public void setHadAccidentInLastYear(boolean hadAccidentInLastYear) {
		this.hadAccidentInLastYear = hadAccidentInLastYear;
	}
	public double getCarValue() {
		return carValue;
	}
	public void setCarValue(double carValue) {
		this.carValue = carValue;
	}
	
	
	//ParameterConstructer
	public CarInsurance(String policyHolderName, double basePremium, int carAgeInYears, boolean hadAccidentInLastYear,double carValue) {
		super(policyHolderName, basePremium);
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValue = carValue;
	}
	

	@Override
	 double calculatePremium() {
		double premium = basePremium;
		
		// For Age
		if(carAgeInYears<=3) {
			premium = premium + basePremium * 0.10;
		}
		else if(carAgeInYears<=7) {
			premium = premium + basePremium * 0.20;
		}
		else if(carAgeInYears > 7) {
			premium = premium + basePremium * 0.30;
		}
		
		//For Accident
		if (hadAccidentInLastYear)
			premium = premium + basePremium * 0.25;
        else
            premium -= basePremium * 0.10;

		// For Car value
		if(carValue>1000000) {
			premium = premium + 2000;
		}
		
		return premium;
		
	}
}  // Class Car End here


class HealthInsurance extends Insurance{
	
	int age;
	boolean isSmoker;
	boolean hasPreExistingDisease;
	
	//Setter & Getter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSmoker() {
		return isSmoker;
	}
	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}
	public boolean isHasPreExistingDisease() {
		return hasPreExistingDisease;
	}
	public void setHasPreExistingDisease(boolean hasPreExistingDisease) {
		this.hasPreExistingDisease = hasPreExistingDisease;
	}
	
	//ParameterConstructer
	public HealthInsurance(String policyHolderName, double basePremium, int age, boolean isSmoker,boolean hasPreExistingDisease) {
		super(policyHolderName, basePremium);
		this.age = age;
		this.isSmoker = isSmoker;
		this.hasPreExistingDisease = hasPreExistingDisease;
	}
	
	@Override
	 double calculatePremium() {
		 double premium = basePremium;
		 
		 if(age<=30) {
			 premium = premium + basePremium*0.10;
		 }
		 else if(age<=45) {
			 premium = premium + basePremium*0.25;
		 }
		 else {
			 premium = premium + basePremium*0.40;
		 }
		 
		 if(isSmoker) {
			 premium = premium + basePremium*0.40;
		 }
		 else {
			 premium = premium - basePremium*0.05;
		}
		 
		 if(hasPreExistingDisease) {
			 premium = premium + basePremium*0.20;
		 }
		 
		 return premium;
	 }
} //HealthInsurance Class End here

class TestInsurance{
	public static void main(String[]  a) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("1. CarInsurance");
		System.out.println("2. HealthInsurance");
		System.out.println("Enter Your choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter policy Holder Name :" );
		String Name = sc.nextLine();
		
		System.out.println("Enter base Premium (Rs.) :" );
		double base = sc.nextDouble();
		
		Insurance I1;//reference
		
		if(choice==1) {
			
			System.out.println("Enter car Age In Years :");
			int age = sc.nextInt();
			
			System.out.println("Enter had Accident In Last Year (true/false) :");
			boolean accident = sc.nextBoolean();
			
			System.out.println("Enter car Value :");
			double value = sc.nextDouble();
			
			I1 = new CarInsurance(Name, base, age, accident, value);
		}
		else if(choice==2) {
			
			System.out.println("Enter Age :");
			int age = sc.nextInt();
			
			System.out.println("is Smoker (True/False) :");
			boolean isSmoker = sc.nextBoolean();
			
			System.out.println("has PreExisting Disease ? ");
			boolean hasPreExistingDisease = sc.nextBoolean();
			
			I1 = new HealthInsurance(Name,base,age,isSmoker,hasPreExistingDisease);
		}
		else {
			System.out.println("Invalid Choice!");
            return;
		}
		
		I1.printPolicyDetails(); // Print All details
	}
}