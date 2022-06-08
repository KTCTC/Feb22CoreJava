package polymorphism.methodoverriding;

public class C extends B{
	
	int aa = 1234;
	static int stAA = 4567;
	
	public void addition(int z)
	{
		System.out.println("This is non static addition method from class C");
		int c = aa + stAA+56+z;
		System.out.println(c);
	}
	
	public static void substraction()
	{
		System.out.println("This is  static substraction  method from C class");
		int c = stAA - 23;
		System.out.println(c);
	}

}
