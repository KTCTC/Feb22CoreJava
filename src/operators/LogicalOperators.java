package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical operators  && , ||
		
		int a =5; 
		int b =7;
		boolean f1 = false;
		boolean f2 = true;
		
		boolean f = f1 & f2;
		
		System.out.println(f);
		
		boolean e = (a<b) || f1;
		System.out.println(e);
		
		boolean d = f1 || f2;
		System.out.println(d);
		
		
		  boolean c =  f1 && f2;
		  System.out.println(c);
		  
		  

	}

}
