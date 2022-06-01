package forloop;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] sss = {"Welcome ", "to ", "KTCTC"};
		
		for (String each:sss)
		{
			System.out.println(each);
			
		}
		
		
		 char[] chArr= {'a','A','b','T','g'};
		
		for (char a:chArr)
		{
			System.out.println(a);
		}		
		
		
		int arr[] = {23,3,45};
		
		for (int e:arr) 
		{
			System.out.println("Inside for each loop");
			System.out.println(e);
		}

	}

}
