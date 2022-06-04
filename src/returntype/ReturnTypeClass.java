package returntype;

public class ReturnTypeClass {

	public static void main(String[] args) {
		
		String data = ReturnTypeClass.concateString("Welcome to ", "KTCTC ", 20.22f);
		System.out.println(data);
		ReturnTypeClass obj = new ReturnTypeClass();
		obj.sample();
		
		int a = obj.addition(23, 44);
		
		System.out.println(a);
		float fl = obj.devision();
		System.out.println(fl);
		ReturnTypeClass.concateString("Welcome to ", "KTCTC ", 2222.22f);
        obj.addition(34, 44);
	}
	
	public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public float devision()
	{
		float f = 45.5f/44.2f;
		
		return 44;
	}
	
	public static String concateString(String str1, String str2, float abc)
	{		
		String ss = str1+str2+abc;		
		
		return ss;
		
	}
	
	public void sample()
	{
		System.out.println("Sample Method");
		
	}
	
	

}
