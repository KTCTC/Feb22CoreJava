package superkeyword;

public class B extends A{
	int aa = 5654656;
	static String name = "PQRS";
	
	public B()
	{	super(44);
		System.out.println("This is B class constructor");
	}
	
	public B(int a)
	{	
		this.aa = a;
		System.out.println("This is para contructor of B");
	}
	
	public B(int a, int b)
	{				
		System.out.println("to para contructor of B");		
	}
	
	public void nonStaticMethod()
	{
		int aa = 777;
		System.out.println("This is non static method from B");
		System.out.println(super.aa);
		System.out.println(aa);
		System.out.println(this.aa);
		super.staticMethod();
		super.nonStaticMethod();
		bm();
		am();
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static method from B");
				
	}
	
	public void bm()
	{
		System.out.println("BM method from B");
	}
	
	public static void main(String[] args) {
		
		B oo2 = new B(12, 33);
		B oo = new B(2);
		B obj = new B();
		obj.nonStaticMethod();
		
		
	}
}
