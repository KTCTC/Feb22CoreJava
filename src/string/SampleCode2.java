package string;

public class SampleCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is ajay. ajay is boy. ajay play cricket.";
		int count = 0;
		int index = 0;
		String str1 = "ajay";	
		
		
		while(!(index<0))
		{			
			index = str.indexOf(str1);
			if (index>=0)
			{
			count++;
			index ++;
			str = str.substring(index+ str1.length()-1);	
			}
			
			
		}
		
		
		

	}

}
