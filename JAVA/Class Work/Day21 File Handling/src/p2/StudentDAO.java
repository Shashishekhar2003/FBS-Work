package p2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDAO {

	private final String FILE_NAME = "Mydata.txt";

	public boolean Student(Student s) {

		try {
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s);
			oos.close();

			return true;

		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		return false;

	}

	public Student getStudent() {

		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student s = (Student) ois.readObject();
			ois.close();

			return s;

		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}

		return null;

	}

}
