package data.types;

public class DataTypeClass2 {

	public static void main(String[] args) {
		int bb = 90;		
		char cc;
		
		//cc = bb; 
		// memory size mismatched so, could not assign int variable value to char variable
		
		char ch = '5';
		int sam = ch;
		System.out.println(sam);
		
		int ab = ch;
		int bg = 'A';
		System.out.println(ch);
		System.out.println(ab);
		
	}

}
