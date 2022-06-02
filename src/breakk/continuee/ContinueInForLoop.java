package breakk.continuee;

public class ContinueInForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before ");
		for (int i=0; i<5;i++)
		{
			if (i==2)
			{
				continue;
				
			}
			
			System.out.println("Heelo");
		}
		System.out.println("After ");
		// we can not write continue and break in one block as continue or break should be last statements in block
		for (int i=0; i<5;i++)
		{
			continue;
			break;
			
		}

	}

}
