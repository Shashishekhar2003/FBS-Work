package S1;

public class Student {
	String Name;
	int RollNo;
	int Marks;
	
	

	public Student(String name, int rollNo, int marks) {
		this.Name = name;
		this.RollNo = rollNo;
		this.Marks = marks;
	}


	void Valid() throws InvalidMarksException
	{
		if(this.Marks > 100) {
			throw new InvalidMarksException();
		}
		else if( this.Marks > 75) {
			System.out.println("Distinction ");
		}
		else if(this.Marks > 60) {
			System.out.println("First");
		}
		else if(this.Marks > 50) {
			System.out.println("Second");
		}
		else if(this.Marks > 35) {
			System.out.println("Pass");
		}
		else {
			throw new InvalidMarksException();
		}
	}

}
