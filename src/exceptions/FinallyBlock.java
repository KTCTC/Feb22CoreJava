package exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before exception");
		int a = 90;
		int b = 0;
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			c = b / a;
		}		
		finally {
			System.out.println("Finally block");
		}
		
System.out.println(c);
		System.out.println("After exception");
	}

}
