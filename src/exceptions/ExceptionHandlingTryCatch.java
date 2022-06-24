package exceptions;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Befoere exception");
		int a = 10;
		int b = 0;
		int c = 0;
		String str = null;
	try {
		c = a/b;
	}
	catch(ArithmeticException e)
	{
		c = a;
		System.out.println("Inside catch block");
		e.printStackTrace();		
		
	}
	
	
	try {
		
		    str.toLowerCase();
			
			System.out.println("Inside try block");
	}
	catch(Exception e)
	{
	
		System.out.println("String is not initialized");
		e.printStackTrace();		
		
	}
				
		System.out.println("After exception");
		
	}

}
