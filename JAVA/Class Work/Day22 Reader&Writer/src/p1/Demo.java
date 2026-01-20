package p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter FW = new FileWriter("Demo.txt");
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("Firstbit");
		BW.newLine();
		BW.write("Solutions");
		BW.newLine();
		BW.write("Fc");
		BW.newLine();
		BW.write("Road");
		BW.newLine();
		BW.write("Pune");
		BW.close();
		
		FileReader FR = new FileReader("Demo.txt");
		BufferedReader BR = new BufferedReader(FR);
		

		String str;
		while((str=BR.readLine()) != null) {
			System.out.println(str);
		}
				
	}

}
