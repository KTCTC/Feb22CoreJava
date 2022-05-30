package methods.parameter;

public class ParameterizedMethodsClass {
	
	
	public void additionMethod(int a, int b) 	
	{
		
		int c = a+b;
		
		System.out.println(c);
	}
	
	public void substractionMethod(float x, int y)
	{
		float c = x-y;
		
		System.out.println(c);
	}
	
	public static void sampleConcateMethod(String str1, String str2, char ch)
	{
		
		String temp = str1+str2+ch;
		System.out.println(temp);
		
	}
	
	public static void sampleMethod3(boolean flag, int c, double d)
	{
		if (flag && c>5)
		{
			System.out.println("Inside if statement");
		}
		else
		{
			System.out.println("inside else");
		}
		
		System.out.println("you have provided double value = "+d);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ParameterizedMethodsClass.sampleMethod3(true, 7, 666.55d);
		
		byte sd = 89;
		
		ParameterizedMethodsClass obj = new ParameterizedMethodsClass();
		
		
		int bb = 90;
		
		String str = "KTCTC";
		obj.additionMethod(23,bb);
		obj.additionMethod(33, 22);
		obj.additionMethod(456, 4567);
		obj.substractionMethod(33.5f, 45);
		obj.sampleConcateMethod("Hi ",str, 'A');
		
		
	}

}
