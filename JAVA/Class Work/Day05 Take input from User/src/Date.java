import java.util.Scanner;
class Date {
    int day, month, year;
    String dow;
    Date()
    {
	System.out.println("default constructor is called");
	this.day=4;
	this.month=8;
	this.year=2025;
	this.dow="saturday";
    }
    Date(int d,int m,int y,String str)
    {
	System.out.println("Paratemerized constructor is called");
	this.day=d;
	this.month=m;
	this.year=y;
	this.dow=str;
     }


    void setDay(int d) 
    { 
         this.day = d; 
    }
    void setMonth(int m) 
    { 
	 this.month = m; 
    }
    void setYear(int y) 
    { 
         this.year = y; 
    }
    void setDOW(String str) 
    { 
         this.dow = str; 
    }

    int getDay() 
    { 
    	return this.day; 
    }
    int getMonth() 
    { 
    	return this.month; 
    }
    int getYear() 
    { 
    	return this.year; 
    }
    String getDOW() 
    { 
    	return this.dow; 
    }



    void display()
    {
    	System.out.println("Day is"+this.day);
	System.out.println("Month is"+this.month);
	System.out.println("Year is"+this.year);
	System.out.println("Dow is"+this.dow);
     }
		
} // Date ends here


class TestDate 
{
    public static void main(String[] a) 
	{
        	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day");
		int day=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Month");
		int month=sc.nextInt();
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		System.out.println("Enter the Day of Week");
		String dow=sc.nextLine();
		sc.nextLine();
		Date b1=new Date(day,month,year,dow);
		b1.display();


    }
}