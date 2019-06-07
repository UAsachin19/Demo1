class Calculator
{
	int num1, num2;
	double result;
	
	void sum()
	{
		result = num1 + num2;
		System.out.println ("Sum of" + num1 + " + " + num2 +" : "+ result);
		
	}
	void mul()
	{
		
		result = num1 * num2;
		System.out.println ("Multiplication of" + num1 + " multiplied by " + num2 +" : "+ result);
	}
		void sub()
	{
		
		
		result = num1 - num2;
		System.out.println ("Subtraction of" + num1 + " - " + num2 +" : "+ result);
System.out.println ("SachinTest");
	}
		void div()
		{
			result = num1 / num2;
			System.out.println ("Division of" + num1 + " / " + num2 +" : "+ result);
		}
	
		void square()
		{
			result = (num1 * num1);
			System.out.println ("Square of" + num1 + " / " + num1 +" : "+ result);
		}
	
	public static void main(String args [])
		{
			Calculator A1 = new Calculator ();
			A1.num1 = 20;
			A1.num2 = 10;
			A1.sum();
			A1.mul ();
			A1.sub ();
			A1.div ();
			A1.square();
			
			
		}
}