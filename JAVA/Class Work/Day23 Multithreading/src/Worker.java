
public class Worker extends Thread{
	
	@Override
	public void run() {
		String str="1234567891011121314151617181920";
		for(int i=0;i<str.length();i++) {
			System.out.print(" "+ str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Test{

public static void main(String[] args) {
	
	Worker w1= new Worker();
	w1.start();
	
	String str="abcdefghijklmnopqrstuvwxyz";
	for(int i=0;i<str.length();i++) {
		System.out.print(" " + str.charAt(i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}	
	

	
}