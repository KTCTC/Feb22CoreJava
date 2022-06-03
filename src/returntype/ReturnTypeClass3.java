package returntype;

public class ReturnTypeClass3 {

	public static void main(String[] args) {
		
	int a = ReturnTypeClass3.sm1(20);
	System.out.println(a);
		
	}
	// return statement inside the method should be last statement (return statements stops/breaks/ends execution of method)
	public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
		System.out.println("After return statement");
	}
	
	public static  int sm1(int a)
	{
		if (a>5)
		{
			System.out.println("sdffsf");
			return 23;
		}
		System.out.println("ABCD");
		return 12;
	}
	
public int sm2(int a)
{
   if(a>4)
   {
	   return 2;
   }
   else
   {
	   return 5;
   }
   
   return 33;
	
}

}
