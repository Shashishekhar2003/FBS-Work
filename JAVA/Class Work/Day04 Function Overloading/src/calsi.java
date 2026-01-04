class calsi
{
	void Add(int a,int b)
	{
	System.out.println("Add fun1 run");
	System.out.println(a+b);
	}

	void Add(double x , double y)
	{
	System.out.println("Add fun2 run");
	System.out.println(x+y);
	}

	void Sub(int a,int b)
	{
	System.out.println("sub fun1 run");
	System.out.println(a-b);
	}

	void Sub(double x,double y)
	{
	System.out.println("sub fun2 run");
	System.out.println(x-y);
	}

	void Mul(int a,int b)
	{
	System.out.println("Mul fun1 run");
	System.out.println(a*b);
	}

	void Mul(double x,double y)
	{
	System.out.println("Mul fun2 run");
	System.out.println(x*y);
	}

	void Div(int a,int b)
	{
	System.out.println("Div fun1 run");
	System.out.println(a/b);
	}

	void Div(double x,double y)
	{
	System.out.println("Div fun2 run");
	System.out.println(x/y);
	}

	
} //class calsi End here



class testCalsi
{
	public static void main(String[] i){
	calsi c1=new calsi();
	int a=10,b=20;
	double x=10.5,y=20.5;
	
	c1.Add(a,b);
	c1.Add(x,y);
	c1.Sub(a,b);
	c1.Sub(x,y);
	c1.Mul(a,b);
	c1.Mul(x,y);
	c1.Div(a,b);
	c1.Div(x,y);
	
	
}
}