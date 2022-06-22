package string;

public class SampleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABBBDFJGGDFABFJFHYDABA";
		int count = 0;
		
		for (int i=0; i<str.length()-1;i++)
		{
			if (str.charAt(i)=='A' && str.charAt(i+1)=='B' )
			{
				count++;
			}
			
		}
		
		System.out.println("Number of time A is  = "+count);
		

	}

}
