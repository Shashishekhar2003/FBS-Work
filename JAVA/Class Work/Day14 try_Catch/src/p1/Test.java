package p1;

class Test {

	public static void main(String[] args) {
		
	
		try {
			int b1= Integer.parseInt(args[0]);
			int a1 = Integer.parseInt(args[1]);
			
			int c= b1/a1;
			System.out.println(c);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Plz enter atleast two input");
		}
		catch(ArithmeticException AE)
		{
			System.out.println("Dusra Arg 0 mat dal");
		}
		catch(NumberFormatException NE)
		{
			System.out.println("provide only digits");
		}
		
	
	}
} //Test End here