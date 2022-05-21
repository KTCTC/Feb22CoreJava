package variable.types;

public class StaticKeywordClass {
	int nonStaticInt ;
	static int staticInt ;
	
	
	public void sampleNonStaticMethod()
	{
		System.out.println(nonStaticInt);
		System.out.println(staticInt);
		
	}
	
	
	public static void sampleStaticMethod()
	{
	//	System.out.println(nonStaticInt);
		System.out.println(staticInt);
	}
	
	public static void sampleStaticMethod2()
	{
		StaticKeywordClass obj = new StaticKeywordClass();
		obj.nonStaticInt = 88888;
		System.out.println(obj.nonStaticInt);
		
		
	}
	
	public void sampleNonStaticMethod2()
	{
		StaticKeywordClass obj = new StaticKeywordClass();
		obj.nonStaticInt = 88888;
		System.out.println(obj.nonStaticInt);
		System.out.println(nonStaticInt);
		System.out.println(obj.staticInt);
		System.out.println(staticInt);
	}
	
	
	public static void main(String[] args) {
		
		
		StaticKeywordClass.sampleStaticMethod();
		
		StaticKeywordClass oo = new StaticKeywordClass();
		StaticKeywordClass obj = new StaticKeywordClass();
		oo.staticInt =99;
		obj.nonStaticInt = 77;
		oo.nonStaticInt = 55;
		
		obj.sampleNonStaticMethod2();
		
		
		obj.sampleStaticMethod2();
		
		
		oo.sampleNonStaticMethod();
		obj.sampleNonStaticMethod();
		
	}

}
