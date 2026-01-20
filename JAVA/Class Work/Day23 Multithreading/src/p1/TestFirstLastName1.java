package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFirstLastName1{

    public static void main(String[] args) {

        // Thread for first.txt
        new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				 try (BufferedReader br = new BufferedReader(new FileReader("first.txt"))) {
	                    String line;
	                    while ((line = br.readLine()) != null) {
	                        System.out.println(" " + line);
	                        Thread.sleep(1000);
	                    }
	                } catch (IOException | InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
		}).start();
        
        
        
        // Thread for last.txt
        new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				 try (BufferedReader br = new BufferedReader(new FileReader("last.txt"))) {
	                    String line;
	                    while ((line = br.readLine()) != null) {
	                        System.out.println(" " + line);
	                        Thread.sleep(1000);
	                    }
	                } catch (IOException | InterruptedException e) {
	                    e.printStackTrace();
	                }
			}
		}).start();

    }
}
