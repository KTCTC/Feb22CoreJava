package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		//Relational operator   <,>,<=,>=,==,!=
		
		int a = 5;
		int b = 50;
		float xx = 8.5f;
		float yy = 4.5f;
		
		boolean f8 = xx!=yy;
		System.out.println(f8);
		boolean f7 = a!=b;
		System.out.println(f7);
		
		System.out.println("----------------------------------");
		
		boolean f5 = xx==yy;
		System.out.println(f5);
		boolean f6 = a==b;
		System.out.println(f6);
		
		System.out.println("----------------------------------");
		boolean f3 = xx>=yy;
		System.out.println(f3);
		boolean f4 = a>=b;
		System.out.println(f4);
		
		System.out.println("----------------------------------");
		boolean f1 = xx<=yy;		
		System.out.println(f1);
		boolean f2 = a<=b;
		System.out.println(f2);
		
		System.out.println("----------------------------------");
		boolean ll1 = xx>yy;		
		System.out.println(ll1);		
		boolean flag1 = a>b;		
		System.out.println(flag1);
		
		System.out.println("----------------------------------");
		
		boolean ll = xx<yy;		
		System.out.println(ll);		
		boolean flag = a<b;		
		System.out.println(flag);
		
		  

	}

}
