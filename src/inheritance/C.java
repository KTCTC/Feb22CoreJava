package inheritance;

public class C extends B{
	
	float cc = 55.77f;
	static String stName = "C CLass Static variable";
	
	
	public void sampleNonStaticMethodFromC()
	{
		System.out.println("sample Non Static Method From C");
	}
	
	public static void staticMethodFromC()
	{
		System.out.println("static Method From C");
	}
	

}
