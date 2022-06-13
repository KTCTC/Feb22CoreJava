package abstractclass;

public abstract class AbstractClass extends AbstractClass2{
	public int ab = 78;
	static String name = "KTCTC";
	public final static int ABCD = 45;
	
	public AbstractClass()
	{
		System.out.println("This is default constructor of Abstract class");
	}
	
	public abstract void abstractMethodFromAbstractClass();
	
	public void sampleMethod()
	{
		System.out.println("This is sample non static method");
	}
	
	public static void staticMethodFromAbstractClass()
	{
		System.out.println("static Method From Abstract Class");
	}
	
	public static void main(String[] args) {
		
		AbstractClass.staticMethodFromAbstractClass();
	}
	
	public  void abcdFromAbstractClass2()
	{
		System.out.println("abcd Abstract class 2 method implemented by Abstract class");
	}
	
	public void reserveBankInterfaceMethod()
	{
		System.out.println("reserve Bank Interface Method");
	}

}
