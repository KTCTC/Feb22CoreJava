package superkeyword;

public class A {
	int aa = 56;
	static String name = "ABCD";
	float height = 67.3f;
	public A(int a)
	{
		this.aa =88;
		System.out.println("This is A class PARA constructor");
	}
	public A()
	{
		this.aa =88;
		System.out.println("This is A class constructor");
	}
	
	public void nonStaticMethod()
	{
		System.out.println("This is non static method from A");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static method from A");
	}
	
	public void am()
	{
		System.out.println("This is AM method from A");
	}
}
