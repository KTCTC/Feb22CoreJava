package inheritance;

public class B extends A{
	
	int bb = 40;
	static int stBB = 23;
	public B()
	{
		System.out.println("This is B constructor");
	}
	
	public void sampleNonStaticMethodFromB()
	{
		System.out.println("sample Non Static Method FromB");
	}
	
	public static void staticMethodFromB()
	{
		System.out.println("static Method From B");
	}
	

}
