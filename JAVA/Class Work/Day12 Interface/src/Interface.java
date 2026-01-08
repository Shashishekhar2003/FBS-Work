abstract class Vehical{
	
	abstract void Ride();
	abstract void Break();
}


interface Racer{
	void ToRace();
}

interface Product{
	void Buy();
	
	void Sell();
	
}

class SportsCar extends Vehical implements Racer,Product{
	
	void Ride() {
		
	}
		
	
	void Break() {
		
	}
	
	 public void ToRace() {
		
	}
	public void Buy() {
		
	}
	public void Sell() {
		
	}
	
}  // class SportsCar End here

abstract class Animal{
	
	abstract void Eat();
	abstract void Walk();
	
	
}//Animal End 


class Horse extends Animal implements Product,Racer{
	
	void Eat() {
		
	}
	void Walk() {
		
	}
	
	
    public void Buy() {
    	
    }
	
    public void Sell() {
		
	}
	
   public void ToRace() {
    	
    }
}


class Test{
	public static void main(String [] a) {
		System.out.println("Hello");
	}
}

















