package operators;

public class UneryOperator {

	public static void main(String[] args) {
		// Unary operator   exp++,exp--,++exp,--exp,~,!
		int a = 5;// 4,3,2
		int b = 7;// 6,7
		float xx = 8.5f;
		float yy = 4.5f;
		
		boolean f2 = !(a<b);
		System.out.println(f2);
		
		boolean flag = false;
		boolean f1 = !flag;
		
		System.out.println(f1);
		
		
		int i = ~a; // a * -1 -1
		System.out.println(i);
		
		
		int h  = --a+--a+--b+a--+b++; // 4 + 3 + 6 + 3 + 6
		
		System.out.println(h);
		
		int g = a++-b--+--a+--b;// 5 - 7 + 5 + 5
		System.out.println(g);
		
		int f = --b;
		System.out.println(f);
		System.out.println(b);
		
		int e = ++a;
		System.out.println(e);
		System.out.println(a);
		
		
		int d = b--;
		System.out.println(d);
		System.out.println(b);
		
		int c = a++;
		System.out.println(c);
		System.out.println(a);
		

	}

}
