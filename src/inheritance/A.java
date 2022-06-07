package inheritance;

public class A {
	
	int aa = 90;
	static int stAA = 33;
	
	public  void m()
	{
		System.out.println("this is M method from A");
	}
	public void sampleNonStaticMethodFromA()
	{
		System.out.println("sample Non Static Method From A");
	}
	
	public static void staticMethodFromA()
	{
		System.out.println("static Method From A");
	}
	
	public static void main(String[] args) {
		
		A objA = new A();
		objA.aa = 67;
		objA.stAA = 45;
		objA.sampleNonStaticMethodFromA();
		objA.staticMethodFromA();
		
		B objB = new B();
		
		objB.aa = 88;
		objB.bb =66;
		objB.stAA = 45;
		objB.stBB = 34;
		
		objB.sampleNonStaticMethodFromA();
		objB.sampleNonStaticMethodFromB();
		objB.staticMethodFromA();
		objB.staticMethodFromB();
	}

}
