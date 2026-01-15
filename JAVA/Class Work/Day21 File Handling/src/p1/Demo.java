package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	int roll;
	String name;

	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
}
// Student End Here


class Test{
	
	public static void main(String[] a) {   //Read Wala Code
		
		try {
			FileInputStream FIS = new FileInputStream("mydat.txt");	
			//DataInputStream DIS = new DataInputStream(FIS);
			ObjectInputStream OIS = new ObjectInputStream(FIS);
			Student S1=(Student) OIS.readObject();
			System.out.println(S1);
			
		}
		catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main1(String[] args) {  	  //Write wala code
		
		try {
			FileOutputStream fos = new FileOutputStream("mydat.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			oos.writeObject(new Student(10,"Yash"));
			oos.close();
			System.out.println("Written Done");
		}
		catch (IOException e) {
			e.printStackTrace();

		}
	}
	

}
