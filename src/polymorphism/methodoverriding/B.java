package polymorphism.methodoverriding;

public class B extends A{
	
	int aa = 555;
	static int stAA = 777;
	
	public void addition(int z)
	{
		System.out.println("This is non static addition method from class B");
		int c = aa + stAA+56+z;
		System.out.println(c);
	}
	
	public static void substraction()
	{
		System.out.println("This is  static substraction  method from B class");
		int c = stAA - 23;
		System.out.println(c);
	}
	public void m()
	{
		System.out.println("This is M  non static metyhod from B");
	}

}
