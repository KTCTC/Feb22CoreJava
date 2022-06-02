package breakk.continuee;

public class BreakWithDoWhile {

	public static void main(String[] args) {
		
		int a = 9;
		
		while(a<15)
		{
			System.out.println("Inside while loop");
			a++;
			
			if (a>12)
			{
				break;
			}
			
		}
		
		

	}

}
