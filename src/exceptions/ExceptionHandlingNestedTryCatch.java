package exceptions;

public class ExceptionHandlingNestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Befoere exception");
		int a = 0;
		int b = 2;
		int c = 0;
		String str = null;
		String data = "sdss";
		try {
						
			try {
				int s = Integer.parseInt(data);
			} catch (NumberFormatException e) {

				e.printStackTrace();
			}
			c = a / b;
			str.toLowerCase();
			System.out.println("Inside try block");
		}

		catch (ArithmeticException e) {
			c = a;
			System.out.println("Inside catch block");
			e.printStackTrace();

		} catch (NullPointerException e) {
			System.out.println("String is not initialized");
			
			try {
				int z = b/a;
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			
			
			e.printStackTrace();
		}

		System.out.println("After exception");

	}

}
