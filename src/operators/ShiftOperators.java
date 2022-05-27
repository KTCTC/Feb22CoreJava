package operators;

public class ShiftOperators {

	public static void main(String[] args) {
		// Shift Operators  <<,>>
		int a =5; // 0000 0000 0000 0000 0000 0000 0000 0101
		int b =7; // 0000 0000 0000 0000 0000 0000 0000 0111
		
		// 34%32 = 2
		
		int e = a<<2;  // a * 2^2
		System.out.println(e);
		
		int d = b>>2;// 000000 0000 0000 0000 0000 0000 0000 01 // b/ 2^2
		System.out.println(d);
		int c = a<<3; // 00 0000 0000 0000 0000 0000 0000 010100  // a * 2^3
		System.out.println(c);

	}

}
