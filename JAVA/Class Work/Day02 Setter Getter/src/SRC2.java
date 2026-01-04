class Date2
{
	void setDay(int x)
	{
	this.day=x;
	}

	void setMonth(int m)
	{
	this.month=m;
	}

	void setYear(int y)
	{
	this.year=y;
	}

int day,month,year;
} //date end here


class Test2
{
public static void main (String [] a)
	{
	 Date2 d1;
	 d1=new Date2();

	 d1.setDay(3);
	 d1.setMonth(2);
	 d1.setYear(2003);

	
	System.out.printf("%d/ %d/ %d " ,d1.day,d1.month,d1.year);
	}
}