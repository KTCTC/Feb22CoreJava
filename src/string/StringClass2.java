package string;

public class StringClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		// charAt(), length(),endsWith(" "),startsWith(),replace(),split(" "),trim(),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		
		String str = "Welcome to KTCTC.How are you?";
		String str1 = "     to     KTCTC    ";
		String str2 = "Welcome to KTCTC.How are you?";
		
		String ss7 = str.toUpperCase();
		System.out.println(ss7);
		String ss6 = str.toLowerCase();
		System.out.println(ss6);
		boolean flag5 = str.equalsIgnoreCase("Welcome TO ktctc.How are you?");
		System.out.println(flag5);
		String ss5 = str1.concat(str);
		System.out.println(ss5);
		
		boolean flag4 = str.equals(str2);
		System.out.println(flag4);
		
		boolean flag3 = str.contains("to KTCTC");
		System.out.println(flag3);
		String ss4 = str.substring(2, 5);
		System.out.println(ss4);
		String ss3 = str.substring(7);
		System.out.println(ss3);
		String ss2 = str1.trim();
		System.out.println(ss2);
		
		String[] sarr = str.split(".H");
		System.out.println(sarr[1]);
		
		String ss1 = str.replace("to", "20tr");
		System.out.println(ss1);
		
		String ss =  str.replace('o', 'Q');
		System.out.println(ss);
		boolean flag2 = str.startsWith("welcome to");		
		System.out.println(flag2);
		boolean flag1 = str.endsWith(str1);
			
		System.out.println(flag1);
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
