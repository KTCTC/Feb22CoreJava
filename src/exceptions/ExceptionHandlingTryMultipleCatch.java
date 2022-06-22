package exceptions;

public class ExceptionHandlingTryMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Befoere exception");
		int a = 10;
		int b = 2;
		int c = 0;
		String str = null;
		String data = "sdss";
	try {
		   int s = Integer.parseInt(data);
		    c = a/b;
		    str.toLowerCase();			
			System.out.println("Inside try block");
	}
	
	catch(ArithmeticException e)
	{
		c = a;
		System.out.println("Inside catch block");
		e.printStackTrace();		
		
	}
	catch(NullPointerException e)
	{
		System.out.println("String is not initialized");
		e.printStackTrace();
	}
	catch(Exception e)
	{
		System.out.println("All exceptions are catched");
		e.printStackTrace();
	}
	
				
		System.out.println("After exception");
		
	}

}
