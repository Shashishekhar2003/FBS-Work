package S1;

public class TestStudent {
	
	public static void main(String[] a) {
		
		Student s1 = new Student("Yash",21,30);
		
		
		try
		{
			s1.Valid();
		}
		catch(InvalidMarksException e)
		{
			System.out.println(e);
		}
	}

}
