package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternery Operators (if-then-else)  ? :
		
		int a = 6;
		int b = 67;
		int age = 20;
		boolean indian = true;
		
		String str =  indian && age>=18?"You can vote in India":"You can not vote in India";
		
		System.out.println(str);
		
		char d = a<b? 'A':'B';
		System.out.println(d);
		
		int c = a>b ? 45:56;
		System.out.println(c);
		 

	}

}
