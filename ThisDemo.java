class ThisDemo
{
	int num1, num2;
	
	ThisDemo (int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	int add()
	{
		return num1+num2;
	}
	public static void main (String [] args)
	{
		ThisDemo obj = new ThisDemo(5, 6);
		int result = obj.add();
		System.out.println ("Result : " + result);
		System.out.println ("Result : " + result + "Sachin Test");
	}
}