package superkeyword;

public class C extends B{
	int aa = 234;
	static String name = "FGTRTVGGF";
	public C(int a)
	{
		this.aa =88;
		System.out.println("This is C class PARA constructor");
	}
	public C()
	{
		super(23, 34);
		this.aa = 88;
		System.out.println("This is C class constructor");
	}
	
	public void nonStaticMethod()
	{
		System.out.println("This is non static method from C");
		System.out.println(super.aa);
		System.out.println(super.height);
		super.nonStaticMethod();
		super.am();
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static method from C");
	}
	
	public void am()
	{
		System.out.println("This is AM method from C");
	}
}
