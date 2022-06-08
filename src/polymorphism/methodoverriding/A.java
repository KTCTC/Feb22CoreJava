package polymorphism.methodoverriding;

public class A {
	
	int aa = 34;
	static int stAA = 44;
	
	public void addition(int s)
	{
		System.out.println("This is non static addition method from class A");
		int c = aa + stAA;
		System.out.println(c);
	}
	
	public static void substraction()
	{
		System.out.println("This is  static substraction  method from A class");
		int c = stAA - 23;
		System.out.println(c);
	}
	
	public void m()
	{
		System.out.println("This is M  non static metyhod from A");
	}

}
