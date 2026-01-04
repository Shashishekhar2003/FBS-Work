import java.util.Scanner;
class Date {
    int day, month, year;
    String dow;
    Date()
    {
	System.out.println("Default constructor is called");
	this.day=0;
	this.month=0;
	this.year=0000;
	this.dow=" Unknown";
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
    public static void main(String[] args) 
	{
	Date arr[] = new Date[3];

	arr[0] = new Date();
	arr[1] = new Date(7,11,2025,"Friday");
	arr[2] = new Date();

	for(int i=0;i<arr.length;i++)
	{
	//System.out.println(arr[i]);
	arr[i].display();
	}

    }
}