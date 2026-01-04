class Shape 
{
	void Area(int base , int height)
	{
	System.out.println("Area of Triangle");
	int res=(base * height) / 2;
	System.out.println(res);
	}

	void Area(int length, double b)
	{
	System.out.println("Area of Rectangle");
	double res=length * b;
	System.out.println(res);
	}

	void Area (int radius)
	{
	System.out.println("Area of Circle");
	double res=3.14 * (radius * radius);
	System.out.println(res);
 	}
} //Class Shape End here

class testShape
{
public static void main(String [] args){
	Shape s1=new Shape();
	int length=10,breadth=20,height=30,base=12,radius=5;
	double b=20;

	s1.Area(base,height);
	s1.Area(length,b);
	s1.Area(radius);

}
}