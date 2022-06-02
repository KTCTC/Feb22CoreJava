package breakk.continuee;

public class BreakWithWhile {

	public static void main(String[] args) {
		
		int a = 9;
		
		do
		{
			System.out.println("Inside while loop");
			a++;
			
			if (a>120)
			{
				break;
			}
			
		}while(a<15);
		
		

	}

}
