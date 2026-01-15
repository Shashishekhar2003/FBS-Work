package p2;

import java.io.Serializable;

public class Student implements Serializable {

	int RollNo;
	String Name;

	Student(int rollNo, String name) {
		RollNo = rollNo;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [ RollNo = " + RollNo + ", Name = " + Name + " ]";
	}

}

class Test_Student {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		
		dao.Student(new Student(7877,"Yashodeep"));
		System.out.println("Write successfully..!!");
		
		Student s = dao.getStudent();
		System.out.println("Reading Successfully..!!");
		System.out.println(s);
		
	}
}
