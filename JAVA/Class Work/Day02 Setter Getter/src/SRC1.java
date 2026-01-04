class Date1
{
int day,month,year;
} //date end here


class Test1
{
public static void main (String [] a)
	{
	 Date d1;// reference
	 d1=new Date();
	 System.out.println(d1);

	d1.day=31;
	d1.month=10;
	d1.year=2025;
	System.out.printf("%d/ %d/ %d " ,d1.day,d1.month,d1.year);
	}
}