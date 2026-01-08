package P2;

//import P1.A;

public class X {
	public void myFunX() {
		P1.A ref;
		ref = new P1.A();
		ref.myFunA();
	}
}

class Y extends P1.A{
	void myFunY() {
		P1.A ref;
		ref = new P1.A();
		ref.myFunA(); // direct object  
		super.myFunA();//Inheritance
		this.myFunA();
		
	}
}