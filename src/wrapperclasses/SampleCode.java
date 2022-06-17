package wrapperclasses;

public class SampleCode {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		char array[] = {'a','2','B','q','4','F','#'};
		int lowercase = 0;		
		int upercase = 0;
		int digit = 0;
		int special = 0;
		
		for (char each:array)
		{
			if (Character.isLowerCase(each))
			{
				lowercase++;
			}
			else if (Character.isUpperCase(each))
			{
				upercase++;
			}
			else if (Character.isDigit(each))
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
		
		System.out.println(lowercase);
		System.out.println(upercase);
		System.out.println(digit);
		System.out.println(special);
		
		for (int i=0; i<array.length;i++)
		{
			if (Character.isLowerCase(array[i]))
			{
				lowercase++;
			}
			else if (Character.isUpperCase(array[i]))
			{
				upercase++;
			}
			else if (Character.isDigit(array[i]))
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
	    

	}

}
