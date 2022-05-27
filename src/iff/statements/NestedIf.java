package iff.statements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 4;
		
		
		if (a>5)
		{
			System.out.println("Inside if");
			
			if (b<9)
			{
				System.out.println("Inside inner if");
			}
		
			else
			{
				System.out.println("fff");
			}
			
		}
		else
		{
			System.out.println("Inside else block..");
			
			if (b<100)
			{
				System.out.println("If inside else block");
				
				
				int marks = 67;
				
				if (marks<35)
				{
					System.out.println("You are fail");
				}
				else if (marks>35)
				{
					System.out.println("You are passed");
				}
				else if (marks>=35 && marks<50)
				{
					System.out.println("You are passed with second class");
				}
				else if (marks>=50 && marks <60)
				{
					System.out.println("You are passed with first class");
				}
				else if (marks>=60 && marks<=100)
				{
					System.out.println("You are pased with distinction");
				}
				else
				{
					System.out.println("You have entered invalid marks");
				}
				
				
				
				
			}
		}

	}

}
