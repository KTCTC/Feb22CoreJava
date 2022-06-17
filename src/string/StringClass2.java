package string;

public class StringClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		// charAt(), length(),endsWith(" "),startsWith(),replace(),split(" "),trim(),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		
		String str = "Welcome to KTCTC";
			
		
		for (int i=0; i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		int length = str.length();
		System.out.println(length);
		
		char ch = str.charAt(2);
		System.out.println(ch);
		

	}

}
