package polymorphism.methodoverloading;

public class CompileTimePolymorphism {
int a;
int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		obj.addition();
		obj.addition(34.56f);
		obj.substraction();
		obj.substraction(34, 34);		
		CompileTimePolymorphism.substraction();
		CompileTimePolymorphism.substraction(23, 23);
		

	}
	
	public void addition()
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void addition(int x, int y)
	{
		int c = x+y;
		System.out.println(c);
		addition();
		
	}
	
	public void addition(float a)
	{
		float c = a+b+ this.a;
		System.out.println(c);
	}
	
	public void addition(String str1, String str2)
	{
		String data = str1+str2;
		System.out.println(data);
		
	}
	
	public static void substraction()
	{
		int c = 23-45;
		System.out.println(c);
	}
	public static void substraction(int t, int g)
	{
		int c = t-g;
		System.out.println(c);
	}
	
	
}
