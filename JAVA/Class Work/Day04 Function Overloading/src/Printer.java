// Example of Function Overloading

class Printer {

	void Print(int a) {
		System.out.println(a);
	}

	void Print(char ch) {
		System.out.println(ch);
	}

	void Print(String str) {
		System.out.println(str);
	}

} // class Printer End Here

class Test {
	public static void main(String[] a) {
		Printer p1 = new Printer();

		p1.Print(10);
		p1.Print('a');
		p1.Print("Yashodeep");
	}
}