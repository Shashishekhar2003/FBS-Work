package P1;

public class A {
	void myFunA() {
		System.out.println("Inside class A");
	}
}
class B extends A{
	void myFunB() {
	A ref;
	ref = new A();
	ref.myFunA();
	}
}
class C{
	void myFunC() {
		A ref;
		ref = new A();
		ref.myFunA();
	}
}