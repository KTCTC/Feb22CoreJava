package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// Assignment Operators = ,+= ,-= ,*= ,/= ,%= , <<= ,>>= 
		
		int a = 77;		
		int b = a;
		
		b>>=2;// b = b>>2; b/2^2
		System.out.println(b);
		System.out.println("--------------------------");
		a<<=2; // a = a<<2;  a * 2^2
		System.out.println(a);
		System.out.println("--------------------------");
		b%=4;// b = b%4;
		System.out.println(b);
		System.out.println("--------------------------");
		a/=9;// a = a/9;
		System.out.println(a);
		System.out.println("--------------------------");
		a*=2; // a  = a *2;
		System.out.println(a);
		
		System.out.println("--------------------------");
		a-=33; // a = a-33;
		System.out.println(a);		
		System.out.println("--------------------------");
		a+=5; // a = a + 5;
		System.out.println(a);
		a+=b; // a = a +b;
		System.out.println(a);
		
		    

	}

}
