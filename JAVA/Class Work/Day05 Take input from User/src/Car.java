import java.util.Scanner;
class Car
{
	String model;
	String brand;
	double price;
	String colour;
	int feulcapacity;
	Car()
	{
		System.out.println(" default constructor is called");
		this.model="base";
		this.brand="tata";
		this.price=100000;
		this.colour="black";
		this.feulcapacity=50;
	}
	Car(String str,String s,double p,String sm,int i)
	{
		System.out.println(" parameterized constructor is called");

		this.model=str;
		this.brand=s;
		this.price=p;
		this.colour=sm;
		this.feulcapacity=i;
	}
	void setModel(String i)
	{
		this.model=i;
	}
	void setBrand(String str)
	{
		this.brand=str;
	}
	void setPrice(double d)
	{
		this.price=d;
	}
	void setColour(String c)
	{
		this.colour=c;
	}
	void setFeulcapacity(int f)
	{
		this.feulcapacity=f;
	}
	String getModel()
	{
		return this.model;
	}
	String getBrand()
	{
		return this.brand;
	}
	double getPrice()
	{
		return this.price;
	}

	String getColour()
	{
		return this.colour;
	}
	int getFeulcapacity()
	{

		return this.feulcapacity;
	}
	void display()
	{
		System.out.println("Model is"+this.model);
		System.out.println("Brand is"+this.brand);
		System.out.println("Price is"+this.price);
		System.out.println("Colour is"+this.colour);
		System.out.println("Feulcapacity is"+this.feulcapacity);

	}






}//class employee ends here
class TestCar
{

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Model");
		String model=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the Brand");
		String brand=sc.nextLine();
		System.out.println("Enter the Price");
		double price=sc.nextDouble();
		System.out.println("Enter the colour");
		String colour=sc.nextLine();
		System.out.println("Enter the Feulcapacity");
		int feulcapacity=sc.nextInt();
		
		Car b1=new Car(model,brand,price,colour,feulcapacity);
		b1.display();


	}//main ends here
}//class test ends here