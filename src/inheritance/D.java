package inheritance;

public class D extends A{
	
	float dd = 55.77f;
	static String stNameDD = "D CLass Static variable";
	public  void m()
	{
		System.out.println("this is M method from D");
	}
	
	public void sampleNonStaticMethodFromD()
	{
		System.out.println("sample Non Static Method From D");
	}
	
	public static void staticMethodFromD()
	{
		System.out.println("static Method From D");
	}
	
	public static void main(String[] args) {
		
		D objD = new D();
		objD.aa = 78;
		objD.dd = 34;
		objD.staticMethodFromA();
		objD.staticMethodFromD();
		objD.sampleNonStaticMethodFromA();
		objD.sampleNonStaticMethodFromD();
		
		
	}
	

}
