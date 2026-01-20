package p1;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FirstName extends Thread {

	@Override
	public  void run() {
		try {
			BufferedReader BR = new BufferedReader(new FileReader("first.txt"));
			String fName = null;
			while ((fName = BR.readLine()) != null) {
				System.out.println(" " + fName);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
	
	}
}
//FirstName Class End here

class LastName extends Thread {

	@Override
	public  void run() {
		try {
			BufferedReader BR = new BufferedReader(new FileReader("last.txt"));
			String lName = null;
			while ((lName = BR.readLine()) != null) {
				System.out.print(" " + lName);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		
	}

}
//LastName Class End here