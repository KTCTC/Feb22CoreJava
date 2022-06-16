package finall.keyword;

public class SampleFinalClass {
	final int ABCD ;
	final static float PQRS ;
	
	public SampleFinalClass(int a)
	{
		ABCD = a;
	}
	
	
	
	static{
		PQRS = 67;
					
	}
	
	public static void main(String[] args) {
		SampleFinalClass obj = new SampleFinalClass(34);
		
		SampleFinalClass oo = new SampleFinalClass(33);
		
		
		
		  obj.ABCD = 77; 
		  obj.PQRS = 667.45f;
		  
		  SampleFinalClass.PQRS =89.34f;
		 
		
	}
	
	public final void sampleFinalNonStaticMethod()
	{
		System.out.println("sample Final Non Static Method");
	}
	public static final void sampleFinalStaticMethod()
	{
		System.out.println("sample Final Static Method");
	}

}
