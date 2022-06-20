package wrapperclasses;

public class SampleClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[] = {'s','r','w'};
		
		boolean f = isArrayContainsVovel(arr);
		System.out.println(f);

	}

	public static boolean isArrayContainsVovel(char a[])
	{
		boolean flag = false;
		
		for (char each:a)
		{
			if (each=='a'||each=='e'||each=='i'||each=='o'||each=='u')
			{
				flag = true;
				break;
			}
		}
		
		return flag;
	}
	
}
