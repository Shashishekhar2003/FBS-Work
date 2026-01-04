class Student {
	
	int FBID;
	String Name;
	int Distance;
	static int count=0;
	
	Student()     //Default
	{
		System.out.println("S Default Constructor called");
		FBID=00;
		Name="Not Given";
		Distance=00;
		count++;
	}
	
	Student(int FBID ,String Name, int Distance)  //Parameterised
	{
		System.out.println("S Parameter Constructor called");
		this.FBID=FBID;
		this.Name=Name;
		this.Distance=Distance;
		count++;
	}
	
	//setter & getter
	 int getFBID() 
	{
		return FBID;
	}
	 void setFBID(int fBID) 
	{
		FBID = fBID;
	}
	 String getName() 
	
	{
		return Name;
	}
	 void setName(String name) 
	{
		Name = name;
	}
	 int getDistance() 
	{
		return Distance;
	}
	 void setDistance(int distance) 
	{
		Distance = distance;
	}
	
	void display()
	{
		System.out.println("FirstBit ID is  :"+this.FBID);
		System.out.println("Name is : &s"+this.Name);
		System.out.println("Distance is :"+this.Distance);
	}
	

} // class student end here

class PlacedStudent extends Student {
	
	String CName;
	String Designition;
	
	PlacedStudent()    //Default
	{
		 super();
		 System.out.println("PS Default Constructor called");
		 CName="Not Given";
		 Designition="Not given";
	}
	
	PlacedStudent(int FBID , String Name , int Distance , String CName , String Designition)
	{
		super(FBID,Name,Distance);
		System.out.println("PS Parameter Constructor called");
		this.CName=CName;
		this.Designition=Designition;
	}
	
	//setter & getter
	
	 String getCName() 
	{
		return CName;
	}
	 void setCName(String cName) 
	{
		CName = cName;
	}
	 String getDesignition() 
	{
		return Designition;
	}
	 void setDesignition(String designition) 
	{
		Designition = designition;
	}
	
	 void display()
	 {
		 super.display();
		 System.out.println("CName is: "+this.CName);
		 System.out.println("Designition is :"+this.Designition);
	 }
	
} //class PlacedStudent End here

class TestA{
	public static void main(String [] args) {
		PlacedStudent p1 = new PlacedStudent(11,"Yash",500,"TCS","Jr");
		p1.display();
	 
		System.out.println("\n \n");
		PlacedStudent p2 = new PlacedStudent(12,"Shashi",800,"AQZ","Sr");
		p1.display();
		
		System.out.println("\n \n");
		Student s1 = new Student();
		s1.display();
		
	}
}