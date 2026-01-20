
public class Worker1 implements Runnable {

	@Override
	public void run() {
		String str = "1234567891011121314151617181920";
		for (int i = 0; i < str.length(); i++) {
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

class Test1 {

	public static void main(String[] args) {

		Worker1 w1 = new Worker1();
		Thread t1 = new Thread(w1);
				
		t1.start();

		String str = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
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