package iff.statements;

public class IfElseStatement {

	public static void main(String[] args) {

		System.out.println("Before if statement");
		int a = 20;
		
		int age = 45;
		
		if (a>5)
			System.out.println("inside Sample If");
		
		else		
			System.out.println("inside sampleelse");
		
		System.out.println("inside Sample If.......");
		
		if (true)
		{
			System.out.println("Inside if");
		}
		else
		{
			System.out.println("Inside else");
		}
		
		
		if (false)
		{
			System.out.println("Inside if");
		}
		else
		{
			System.out.println("Inside else");
		}
		
		if (age>=18)
		{
			System.out.println("You can vote in India");
		}
		else
		{
			System.out.println("You can not vote in India");
		}
		
		

		if (a < 5) {
			System.out.println("inside If statement 1");
			System.out.println("inside If statement 2");
			System.out.println("inside If statement 3");
			System.out.println("inside If statement 4");

		}
		else
		{
			System.out.println("Inside else part");
		}

		System.out.println("After if statement");

	}

}
