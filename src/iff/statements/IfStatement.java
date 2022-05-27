package iff.statements;

public class IfStatement {

	public static void main(String[] args) {

		System.out.println("Before if statement");
		int a = 2;
		int b = 2;
		
		if (a>0)	
			if(b>5)			
		System.out.println("Inside if if if if ");
		
		
		System.out.println("-------------------------");
		
		if(a<0)
		System.out.println("This is sample if sattement 1");		
		System.out.println("This is sample if sattement 2");
		
		if (false)
		{
			System.out.println("inside if false");
		}
		
		if (true)
		{
			System.out.println("inside if");
		}

		if (a < 5) {
			System.out.println("inside If statement 1");
			System.out.println("inside If statement 2");
			System.out.println("inside If statement 3");
			System.out.println("inside If statement 4");

		}

		System.out.println("After if statement");

	}

}
